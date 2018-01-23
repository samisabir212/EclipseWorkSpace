package basics;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateResponseBody {

	/*
	 * In this class i want to validate something in the response body
	 * there could be multiple paramters that we are getting
	 * but in a test case there could be a scenario where i have to validate some 
	 * object value
	 * 
	 */
	
	@BeforeClass
	public void setUp() {
		

		RestAssured.baseURI = "https://maps.googleapis.com"; //base uri
		RestAssured.basePath ="/maps/api"; //resource path
	}
	
	
	@Test
	public void 	validateTextInDistanceMatrix() {
		
		given()
		  .param("units" , "imperial")
		  .param("origins", "Washington,DC")
		  .param("destinations", "New+York+City,NY")
		  .param("key", "AIzaSyBNJ9O1uJOPQ6SjsxFkIlEkE8qXn6Nshf8")
	.when()
	 	  .get("/distancematrix/json")
	.then()
		  .statusCode(200)
		  .and()
		  .body("rows[0].elements[0].distance.text", equalTo("225 mi"))
		  .contentType(ContentType.JSON);
		
	}
	
	
}
