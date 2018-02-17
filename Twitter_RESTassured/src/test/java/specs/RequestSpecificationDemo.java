package specs;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationDemo {
	
	//Config access variables
	private String consumerKey = "1zoY2CUzSZxD2kNDvw8CZTHvu";
	private String consumerSecret = "HM4ybxlvDCGd3sVnjfYxncxpjgdDfO4AsKgaUV6XO1wnL8LTST";
	private String accessToken ="919360911957286912-gkZlYI1chNI2mSkIRfbOuEQlsaoAlJx";
	private String accessSecret = "oPcYhdtV9cgspKcIYUEqfT647Wtq3IaZQT8jFFVsvkAAG";

	//class object variables
	public String tweet_ID = "";
	
	RequestSpecBuilder requestBuilder;
	static RequestSpecification requestSpec;
	
	@BeforeClass
	public void setUp() {
		
		//https://api.twitter.com/1.1/statuses/show.json?id=210462857140252672
		//document line33
		//https://developer.twitter.com/en/docs/tweets/post-and-engage/api-reference/get-statuses-show-id
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
		
		
	}
	//https://api.twitter.com/1.1/statuses/update.json?status=My Second Tweet
	

	@Test(enabled = true)
	public void readTweet() {
		
		given()
		.spec(requestSpec)
//		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
//		.queryParam("user.i_id", tweet_ID)
		.when()
		 	  .get("/user_timeline.json")
		.then()
		.log().body()
		.statusCode(200);
		
		
		//System.out.println("The tweet text is:: " + text);

	}
	

}
