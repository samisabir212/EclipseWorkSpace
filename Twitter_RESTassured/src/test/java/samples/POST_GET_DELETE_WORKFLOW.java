package samples;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POST_GET_DELETE_WORKFLOW {

	// https://api.twitter.com/1.1/statuses/show.json?id=210462857140252672

	/*
	 * in this class of tests i want to create a tweet then i want to verify and
	 * validate that i created that tweet by its ID then i want to delete that
	 * tweet. then i want to verify that i deleted that tweet by its ID
	 * 
	 * DOC for deleting id ::
	 * https://developer.twitter.com/en/docs/tweets/post-and-engage/api-reference/
	 * post-statuses-destroy-id
	 */

	// Config access variables
	private String consumerKey = "wJxxXDBD7ZRd3XfcKYqrAISON";
	private String consumerSecret = "cT3AmxtRj2WpcB9adK473tFcQW5vMKV5IpiShpZVcVzJshigtt";
	private String accessToken = "919360911957286912-gkZlYI1chNI2mSkIRfbOuEQlsaoAlJx";
	private String accessSecret = "oPcYhdtV9cgspKcIYUEqfT647Wtq3IaZQT8jFFVsvkAAG";

	// class object variables
	public String tweet_ID2 = "";

	@BeforeClass
	public void setUp() {

		RestAssured.baseURI = "https://api.twitter.com";
		RestAssured.basePath = "/1.1/statuses";
	}
	// https://api.twitter.com/1.1/statuses/update.json?status=My Second Tweet

	@Test(enabled = true)
	public void postTWEET() {
		Response response = given()
				.auth()
				.oauth(consumerKey, consumerSecret, accessToken, accessSecret)
				.queryParam("status", "im posting this tweet to read it then i want to delete the tweet 2").when()
				.post("/update.json")
				.then().statusCode(200).extract().response();

		tweet_ID2 = response.path("id_str");
		System.out.println("The reponse.path:: " + tweet_ID2);

	}

	@Test(enabled = true, dependsOnMethods = { "postTWEET" })
	public void readTweet_Using_Get_Request() {
		Response response = given()
				.auth()
				.oauth(consumerKey, consumerSecret, accessToken, accessSecret)
				.queryParam("id", tweet_ID2)
				.when()
				.get("/show.json")
				.then().extract().response();

		String text = response.path("text");
		System.out.println("The tweet text is:: " + text);

	}

	@Test(enabled = true, dependsOnMethods = { "readTweet_Using_Get_Request" })
	public void deleteTweet() {
		// Response response = <-- only use response when trying to get something or
		// post something
		given()
		.auth()
		.oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("id", tweet_ID2)
		.when()
		.post("/destroy.json")
		.then().statusCode(200);

	}

}
