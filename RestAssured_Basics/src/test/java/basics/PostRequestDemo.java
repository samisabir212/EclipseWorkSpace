package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequestDemo {
	
	/*
	 * in order to create a post request
	 * i have to supply the body "payload"
	 * so we can get back a reponse
	 * request body goes into the given() then()
	 */
	
	

	@BeforeClass
	public void setUp() {
		

		RestAssured.baseURI = "https://maps.googleapis.com"; //base uri
		RestAssured.basePath ="/maps/api"; //resource path
	}
	
	
	@Test(enabled = true, groups = "posts")
	public void postRequest() {
		Response res =
		given()
		.queryParam("key", "AIzaSyDo9QTqr5Wg038kQlPwdYdzqzmqnET4Fto")
		.body("{"
				+ "\"location\": {"
				+ "\"lat\": -33.8669710,"
				+ "\"lng\": 151.1958750"
				+ "},"
				+ "\"accuracy\": 50,"
				+ "\"name\": \"Google Shoes!\","
				+ "\"phone_number\": \"(02) 9374 4000\","
				+ "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","
				+ "\"types\": [\"shoe_store\"],"
				+ "\"website\": \"http://www.google.com.au/\","
				+ "\"language\": \"en-AU\""
				+ "}")
		.when()
		 	  .post("/place/add/json");
//		.then()
//		.statusCode(200).and()
//		.contentType(ContentType.JSON).and()
//		.body("scope", equalTo("APP")).and()
//		.body("status", equalTo("OK"));
		
		System.out.println(res.body().asString());
			

	}
	
	

}
