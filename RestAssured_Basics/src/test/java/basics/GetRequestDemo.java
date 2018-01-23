package basics;

import static io.restassured.RestAssured.given;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import generic.Common_API;
import io.restassured.RestAssured;
import io.restassured.response.Response;

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
	
	
	@Test(enabled = false)
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
	
	
	@Test
	public void getRequestBody() {
		
		Response res = 
		given()
		  .param("units" , "imperial")
		  .param("origins", "Washington,DC")
		  .param("destinations", "New+York+City,NY")
		  .param("key", "AIzaSyDnUnuzQVgn9XsF6vFs09mKfiLO3zDVg8A")
	.when()
	 	  .get("/distancematrix/json");
	 	  //change status code to fail it
		
		//Assert.assertEquals(200, 200);
		//System.out.println("Status code :: "+ res.getStatusCode());
		System.out.println("ResonseBody is :: "+res.body().asString());
		  
		
		
	}

}
