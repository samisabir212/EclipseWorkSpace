package samples;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class LOGGING_Requests_responses {
	
	/*
	 in this class test
	 i want to log an event
	 i want to log a request and response
	 if i want to log a request i have to provide the log() after given()
	 if i want to log a response i have to provide the log() after then()
	 */
	
	
	//class variables

		private String consumerKey = "PJjbMjYw3rNeufb4XIkgoZEyu";
		private String consumerSecret = "kPNb8EXhlGVSIovL9ZSRdGqoIL91OChUA5wLDhrdbSovDebNXB";
		private String accessToken ="919360911957286912-gkZlYI1chNI2mSkIRfbOuEQlsaoAlJx";
		private String accessSecret = "oPcYhdtV9cgspKcIYUEqfT647Wtq3IaZQT8jFFVsvkAAG";

		@BeforeClass
		public void setUp() {
			

			RestAssured.baseURI = "https://api.twitter.com";
			RestAssured.basePath = "/1.1/statuses";
		}
		//https://api.twitter.com/1.1/statuses/update.json?status=My Second Tweet
		

		@Test(enabled = false, priority=1)
		public void response_LOGGING() {
			given()
			.log() //<--- peep the .log() library
			//.headers()
			//.body()
			.all()
			.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
			.queryParam("status", "my tweet from eclipse with logging all")
			.when()
			 	  .post("/update.json")
			.then()
		
			.statusCode(200);

		}

		@Test(enabled = true)
		public void request_lOGGING() {
			given()
			.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
			.queryParam("status", "my tweet from eclipse with logging all 2 .then() .log() .all(pretty)")
			.when()
			 	  .post("/update.json")
			.then()
			.log()  //<--  for logging requests .log() must be after then()
			//.all()
			//.headers()
			//.body()
			//.all()
			//.ifStatusCodeIsEqualTo(404)
			//.ifError()
			.all(true)
			.statusCode(200);
			
		}
	
	

}
