package assert_Examples;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;


public class Assert_Example_Twitter {

	/*
	 in this class test
	 i want to get all the tweets in my timeline in my profile page.
	 i will get this by using my id and username id as query paramters
	 i will use .body() to get all the listed tweets
	 
	 Then i want to assert the username using equalTo()
	 OR
	 Then i want to assert the username with hamcrest method called hasItem()
	 		~~make sure you import the hamcrest dependency
	 Then i want to create a test where i can put all assertions in one body
	 		
	 assertingTweetUserName_withEntity_HashTag :: using HARD ASSERTS***
	 */
	
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
	//https://api.twitter.com/1.1/statuses/update.json?status=My Second Tweet
	
	@Test(enabled = false)
	public void getAllTweets_Log_Body() {
		
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("user_id", "RestAssuredAPI Automation")
		.when()
		 	  .get("/user_timeline.json")
		.then()
		.log()
		.body()
		.statusCode(200);
	
	}
	
	@Test(enabled = false)
	public void assertingTweetUserName() {
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("user_id", "RestAssuredAPI Automation")
		.when()
		 	  .get("/user_timeline.json")
		.then()
		.statusCode(200)
		.body("user.name", hasItem("sami sabir")); //<-- hamcrest assertion
		
	}
	
	//USING HARD AASSERTIONS
	@Test(enabled= false)
	public void assertingTweetUserName_withEntity_HashTag() {
		
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("user_id", "RestAssuredAPI Automation")
		.when()
		 	  .get("/user_timeline.json")
		.then()
			.statusCode(200)
			.body("user.name", hasItem("sami sabir")) //<-- hamcrest assertion
			.body("entities.hashtags[0].text", hasItem("practice"))
			.body("entities.hashtags[0].size", equalTo(1))  //<-- we can get the size of list of entity tweets
			.body("entities.hashtags[1].size", lessThan(2));
		
			
	}

	//using SOFT ASSERT
	@Test(enabled = true)
	public void assertingTweetUserName_withEntity_HashTag_SOFT_ASSERTIONS() {
	
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("user_id", "RestAssuredAPI Automation")
		.when()
		 	  .get("/user_timeline.json")
		.then()
			.statusCode(200)
			.body("user.name", hasItem("sami sabir")) //<-- hamcrest assertion
			.body("entities.hashtags[0].text", hasItem("practice1"),  
				  "entities.hashtags[0].size", equalTo(3),  //<-- notice putting assertions all in one body
				  "entities.hashtags[1].size", lessThan(2));
			
		
	}
	
	
	
	
}
