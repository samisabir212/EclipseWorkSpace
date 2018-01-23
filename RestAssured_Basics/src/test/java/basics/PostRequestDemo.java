package basics;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class PostRequestDemo {
	
	

	@BeforeClass
	public void setUp() {
		

		RestAssured.baseURI = "https://maps.googleapis.com"; //base uri
		RestAssured.basePath ="/maps/api"; //resource path
	}
	
	
	

}
