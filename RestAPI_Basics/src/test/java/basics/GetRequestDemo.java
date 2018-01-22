package basics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class GetRequestDemo {

	/*
	 * Given I have this information 
	 * When I perform this action 
	 * Then this should be the output
	 * 
	 */
	
	
	@BeforeClass
	public void setUp() {
		
		RestAssured.baseURI = "https://maps.googleapis.com"; //base uri
		RestAssured.basePath ="/maps/api"; //resource path
		
		
	}
	
	
	@Test
	public void statusCode_Verification() {
		given()
			  .param("units" , "imperial")
			  .param("origins", "Washington,DC")
			  .param("destinations", "New+York+City,NY")
			  .param("key", "AIzaSyDnUnuzQVgn9XsF6vFs09mKfiLO3zDVg8A")
		.when()
		 	  .get("/distancematrix/json")
		.then()
			  .statusCode(200); //change status code to fail it
			  
			

	}

}
