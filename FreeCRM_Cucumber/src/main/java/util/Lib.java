package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Lib {
	
	
	public static String readproperties(WebDriver driver, String key) throws IOException {

		InputStream fs = new FileInputStream("locator.properties");
		Properties pro = new Properties();
		pro.load(fs);

		String value = pro.getProperty(key);

		return value;

	}


}
