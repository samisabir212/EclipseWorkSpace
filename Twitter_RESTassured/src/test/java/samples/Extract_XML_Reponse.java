package samples;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Extract_XML_Reponse {
	
	/*
	 i want to extract a response from JSON to XML
	 i want to use google places api to accomplish this
	 i want to extract the value and text of the duration time  (line 44 45)
	 i am using the distance matrix api
	 		https://developers.google.com/maps/documentation/distance-matrix/start
	 		
	 this is the url format
https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins=Washington,DC&destinations=New+York+City,NY&key=YOUR_API_KEY
	 */
	
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "https://maps.googleapis.com";
		RestAssured.basePath = "/maps/api";
	}
	@Test
	public void extractResponse() {
		Response response = given()
			.queryParam("units", "imperial")
			.queryParam("origins", "Washington,DC")
			.queryParam("destinations", "New+York+City,NY")
			.queryParam("key", "AIzaSyBr-fkMFJ9r4DNRvgONe2cG_uxu0YPSVKE")
		.when()
			.get("/distancematrix/xml") //<-- notice the xml  -- i want to get an xml response
		.then()
			.statusCode(200).extract().response();
		String responseString = response.asString();
		System.out.println(responseString);
		
		String value = response.path("distancematrixresponse.row.element.duration.value");
		String text = response.path("distancematrixresponse.row.element.duration.text");
		
		System.out.println("duration in text is:: "+ value);
		System.out.println("duration in value is:: " + text);
		
		
		
		
	}
}


