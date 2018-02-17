package specs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.ptg.LessThanPtg;
import org.hamcrest.Matcher;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecificationDEMO {
	
	
	//Config access variables
		private String consumerKey = "1zoY2CUzSZxD2kNDvw8CZTHvu";
		private String consumerSecret = "HM4ybxlvDCGd3sVnjfYxncxpjgdDfO4AsKgaUV6XO1wnL8LTST";
		private String accessToken ="919360911957286912-gkZlYI1chNI2mSkIRfbOuEQlsaoAlJx";
		private String accessSecret = "oPcYhdtV9cgspKcIYUEqfT647Wtq3IaZQT8jFFVsvkAAG";

		//class object variables
		public String tweet_ID = "sami sabir";
		
		RequestSpecBuilder requestBuilder;
		ResponseSpecBuilder responseBuilder;
		static RequestSpecification requestSpec;
		static ResponseSpecification responseSpec;
		
		@BeforeClass
		public void setUp() {
	
			RestAssured.baseURI = "https://api.twitter.com";
			RestAssured.basePath = "/1.1/statuses";
			AuthenticationScheme authScheme = // check out the other authScheme methods
					RestAssured.oauth(consumerKey, consumerSecret, accessToken, accessSecret);
			
			requestBuilder = new RequestSpecBuilder(); 
			requestBuilder.setBaseUri("https://api.twitter.com");
			requestBuilder.setBasePath("/1.1/statuses");
			requestBuilder.addQueryParam("user_id", "sami sabir");
			requestBuilder.setAuth(authScheme);
			requestSpec = requestBuilder.build();
			
			responseBuilder = new ResponseSpecBuilder();
			responseBuilder.expectStatusCode(200);
			//responseBuilder.expectResponseTime(LessThan(1L), TimeUnit.SECONDS);
			responseBuilder.expectBody("user.name", hasItem("sami sabir"));
			responseBuilder.expectBody("user.id_str", hasItem("919360911957286912"));
//			responseBuilder.expectBody("screen_name", hasItem("samisabir22"));
			responseSpec = responseBuilder.build();
			
			
		}
		

		@Test(enabled = true)
		public void gettingReponse_Using_ResponseBuilder_restassured() {
			
			given()
			.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)  
			.queryParam("user_id", tweet_ID)
			.when()
			 	  .get("/user_timeline.json")
			.then()
//			.log().body()
//			.statusCode(200);
			.spec(responseSpec) //<--common validation
			.body("user.screen_name", hasItem("samisabir22"));
			
			

		}
		
		

		@Test(enabled = true)
		public void readTweet() {
			
			given()
				.spec(requestSpec)
			.when()
			 	 .get("/user_timeline.json")
			.then()
				.spec(responseSpec)
				.body("user.screen_name", hasItem("samisabir22"));
			
			
			
			//System.out.println("The tweet text is:: " + text);

		}
		
		
	

}
