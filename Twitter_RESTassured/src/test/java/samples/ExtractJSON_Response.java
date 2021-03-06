package samples;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ExtractJSON_Response {
	

	//class variables

	private String consumerKey = "uFSE1zLe36cxrWuxbbwNV1NcC";
	private String consumerSecret = "oWKzli05ymO6jxbBdg1hnc3DsLggNWzqROHptxkEEsdLcFivKV";
	private String accessToken ="919360911957286912-gkZlYI1chNI2mSkIRfbOuEQlsaoAlJx";
	private String accessSecret = "oPcYhdtV9cgspKcIYUEqfT647Wtq3IaZQT8jFFVsvkAAG";

	@BeforeClass
	public void setUp() {
		

		RestAssured.baseURI = "https://api.twitter.com";
		RestAssured.basePath = "/1.1/statuses";
	}
	//https://api.twitter.com/1.1/statuses/update.json?status=My Second Tweet
	
	@Test(enabled = true, groups = "")
	public void postRequest() {
		Response response = 
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("status", "my third tweet from eclipse")
		.when()
		 	  .post("/update.json")
		.then()
		.statusCode(200)
		.extract().response();
		
		String tweet_ID = response.path("id_str");
		System.out.println(tweet_ID);

	}

}
