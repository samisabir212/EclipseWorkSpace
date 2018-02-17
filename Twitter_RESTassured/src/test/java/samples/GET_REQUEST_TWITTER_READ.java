package samples;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_REQUEST_TWITTER_READ {
	
	/*
	in this class of tests
	i want to create a tweet
	then i want to verify that i created the tweet by using a get request.
	i will validate the tweet by its ID
	 */

	//Config access variables
	private String consumerKey = "JCG71CZonNFBQjKklJjSvN1id";
	private String consumerSecret = "YAzfXMeOGeo3ptvLHDjOoaPvaFZNTjET1LkJtANyRNDRjl1HUS";
	private String accessToken ="919360911957286912-gkZlYI1chNI2mSkIRfbOuEQlsaoAlJx";
	private String accessSecret = "oPcYhdtV9cgspKcIYUEqfT647Wtq3IaZQT8jFFVsvkAAG";

	//class object variables
	public String tweet_ID = "";
	
	@BeforeClass
	public void setUp() {
		
		//https://api.twitter.com/1.1/statuses/show.json?id=210462857140252672
		//document line33
		//https://developer.twitter.com/en/docs/tweets/post-and-engage/api-reference/get-statuses-show-id
		RestAssured.baseURI = "https://api.twitter.com";
		RestAssured.basePath = "/1.1/statuses";
	}
	//https://api.twitter.com/1.1/statuses/update.json?status=My Second Tweet
	
	@Test(enabled = true)
	public void postTWEET() {
		Response response = 
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("status", "Posting this tweet to call a method to read this tweet 3")
		.when()
		 	  .post("/update.json")
		.then()
		.statusCode(200)
		.extract()
		.response();
		
		tweet_ID = response.path("id_str");
		System.out.println("The reponse.path:: "+tweet_ID);

	}


	
	@Test(enabled = true,dependsOnMethods={"postTWEET"})
	public void readTweet_Using_Get_Request() {
		Response response = 
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("id", tweet_ID)
		.when()
		 	  .get("/show.json")
		.then()
		.extract()
		.response();
		
		String text = response.path("text");
		System.out.println("The tweet text is:: " + text);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
