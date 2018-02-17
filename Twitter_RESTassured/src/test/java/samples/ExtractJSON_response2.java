package samples;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractJSON_response2 {
	
	//status update doc
	//https://developer.twitter.com/en/docs/tweets/post-and-engage/api-reference/post-statuses-update
	
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
	public void postRequest_GettingJSON_path_getting_KeysAndValues() {
		Response response = 
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("status", "my sixth tweet with jsonpath added ''user.location'' from eclipse")
		.when()
		 	  .post("/update.json")
		.then()
		.statusCode(200)
		.extract().response();
		
		String responseString = response.asString();
		System.out.println(responseString);
		
		JsonPath jsPath = new JsonPath(responseString);
		String name = jsPath.getString("user.name");
		String creationTime = jsPath.getString("user.created_at");
		//String location = jsPath.getString("user.location");
		System.out.println("the user name is :: "+ name +" and created at " + creationTime);

	}

}
