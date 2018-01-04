package generic;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import util.WebEventListener;




public class Generic {
	

	
    public static WebDriver driver = null;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
	public static Properties prop;

    private String saucelabs_username = "";
    private String browserstack_username = "";
    private String saucelabs_accesskey = "";
    private String browserstack_accesskey = "";
    

	
    

    @Parameters({"useCloudEnv",
            "cloudEnvName",
            "useGrid",
            "platform",
            "os",
            "os_version",
            "browserName",
            "browserVersion",
            "url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv,
                      @Optional("false")String cloudEnvName,
                      @Optional("false") boolean useGrid,
                      @Optional("Mac") String platform,
                      @Optional("Windows") String os,
                      @Optional("Sierra") String os_version,
                      @Optional("firefox") String browserName,
                      @Optional("34") String browserVersion,
                      @Optional("http://www.amazon.com") String url)throws IOException {



        if(useCloudEnv==true){
            if(cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName, browserstack_username, browserstack_accesskey, os,os_version, browserName, browserVersion);

            }else if (cloudEnvName.equalsIgnoreCase("saucelabs")){
                getCloudDriver(cloudEnvName,saucelabs_username, saucelabs_accesskey, os,os_version, browserName, browserVersion);
            }

        }else if (useGrid == true){
        		
        	getGridDriver(platform, browserName, browserVersion);
        	

        }else{

            getLocalDriver(os, browserName);


        }
        
    	try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/sami/eclipse-workspace/"
					+ "WeekEnd_Framework/src/main/java/com/qa/config/configuration.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		
		}

        e_driver = new EventFiringWebDriver(driver);
        eventListener= new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;



        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();




    }
    

    public WebDriver getCloudDriver(String envName,
                                    String envUsername,
                                    String envAccessKey,
                                    String os,
                                    String os_version,
                                    String browserName,
                                    String browserVersion)
                                    throws IOException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser",browserName);
        cap.setCapability("browser_version",browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if(envName.equalsIgnoreCase("Saucelabs")){
            driver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }else if(envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }


    public WebDriver getLocalDriver(@Optional("Mac") String os,String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            if(os.equalsIgnoreCase("Mac")){
                System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_25");
            }else if(os.equalsIgnoreCase("Win")){
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
            }
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            if(os.equalsIgnoreCase("OS X")){
                System.setProperty("webdriver.gecko.driver", "../Base/src/main/java/Drivers/geckodriverMAC");
            }else if(os.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
            }
            driver = new FirefoxDriver();

        } else if(browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;

    }


    public WebDriver getGridDriver(String platform,
                                   String browserName,
                                   String browserVersion) throws MalformedURLException {


        //passing node url to remote driver
        String nodeURL = "http://192.168.1.175:4444/wd/hub";

        //WebDriver driver = null;

        DesiredCapabilities caps = new DesiredCapabilities();

        // Platforms
        if (platform.equalsIgnoreCase("Windows")) {
            caps.setPlatform(org.openqa.selenium.Platform.WINDOWS);
        }
        if (platform.equalsIgnoreCase("MAC")) {
            caps.setPlatform(org.openqa.selenium.Platform.MAC);
        }
        if (browserName.equalsIgnoreCase("Linux")) {
            caps.setPlatform(org.openqa.selenium.Platform.LINUX);
        }

        // Browsers
        if (browserName.equalsIgnoreCase("chrome")) {
            caps = DesiredCapabilities.chrome();
        }
        if (browserName.equalsIgnoreCase("firefox")) {
            caps = DesiredCapabilities.firefox();
        }
        // Version
        caps.setVersion(browserVersion);

        driver = new RemoteWebDriver(new URL(nodeURL), caps);
        // Maximize the browserName's window
        // driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Open the Application
        //driver.get(url);
        return driver;


    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("It has been called");
        driver.quit();
    }


	
	
	
	
}
