package samples;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POST_RequestDemo {
	
	//class variables

	private String consumerKey = "Kjv0F2rvtdPDfAW63FOrqzjGb";
	private String consumerSecret = "CMVOhDZsjlRPKqhTZm9GpKalUHM2jLJXBsped5NcOBDtF58V7i";
	private String accessToken ="919360911957286912-gkZlYI1chNI2mSkIRfbOuEQlsaoAlJx";
	private String accessSecret = "oPcYhdtV9cgspKcIYUEqfT647Wtq3IaZQT8jFFVsvkAAG";

	@BeforeClass
	public void setUp() {
		

		RestAssured.baseURI = "https://api.twitter.com";
		RestAssured.basePath = "/1.1/statuses";
	}
	//https://api.twitter.com/1.1/statuses/update.json?status=My Second Tweet
	
	@Test(enabled = true, groups = "posts")
	public void postRequest() {
		given()
		.auth().oauth(consumerKey, consumerSecret, accessToken, accessSecret)
		.queryParam("status", "my tweet from eclipse")
		.when()
		 	  .post("/update.json")
		.then()
		.statusCode(200);
//		.contentType(ContentType.JSON).and()
//		.body("scope", equalTo("APP")).and()
//		.body("status", equalTo("OK"));
		
		//System.out.println(res.body().asString());
			

	}
	

}
