package usefulTricks;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.lessThan;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RootPathExample {
	
	//Config access variables
		private String consumerKey = "PJjbMjYw3rNeufb4XIkgoZEyu";
		private String consumerSecret = "kPNb8EXhlGVSIovL9ZSRdGqoIL91OChUA5wLDhrdbSovDebNXB";
		private String accessToken ="919360911957286912-gkZlYI1chNI2mSkIRfbOuEQlsaoAlJx";
		private String accessSecret = "oPcYhdtV9cgspKcIYUEqfT647Wtq3IaZQT8jFFVsvkAAG";

		//class object variables
		public String tweet_ID = "";

		
		@BeforeClass
		public void setUp() {
			//https://developer.twitter.com/en/docs/tweets/timelines/api-reference/get-statuses-user_timeline.html
			//using user timeline 

			
			RestAssured.baseURI = "https://api.twitter.com";
			RestAssured.basePath = "/1.1/statuses";
		}
	
	//using SOFT ASSERT
	@Test(enabled = true)
	public void readingTweets() {
	
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("user_id", "RestAssuredAPI Automation")
		.when()
		 	  .get("/user_timeline.json")
		.then() //<--after then we are validating
			.statusCode(200)
			.log().body()
			.rootPath("user") //<-- telling rest assured that rooth path starts at user so now in the body i dont have to type user.name, user.screen_name etc.
			.body("name", hasItem("sami sabir")) //<-- hamcrest assertion
			.body("screen_name", hasItem("samisabir2"))
			.rootPath("entities.hashtags[0]") //<--telling rest that here is my new root path which starts at entities.hashtag[0]
			.body("text", hasItem("practice"),  
				  "size()", equalTo(1),  //<-- notice putting assertions all in one body
				  "size()", lessThan(2));
			
		//rule of thumb
		// dont have multiple root paths for 1 single test method testcase
	}
	
	
	
}
