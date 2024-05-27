package Rest_Assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Collection_of_postmethod {

	@Test
	public void Post_method() {

		RestAssured.given().baseUri("https://e902zlzwjb.execute-api.ap-south-1.amazonaws.com/products").header("ContentType","application/json")
		.body("{\r\n"
				+ "  \"dwellerId\": \"5c9813a2-6c07-43af-a30f-6ff38c4993c3\",\r\n"
				+ "  \"name\": \"snug\",\r\n"
				+ "  \"description\": \"Parking System\",\r\n"
				+ "  \"status\": \"Active\",\r\n"
				+ "  \"type\": \"Software\",\r\n"
				+ "  \"subType\": \"Sf\",\r\n"
				+ "  \"version\": \"Version 1.0\"\r\n"
				+ "}").when().post().prettyPrint();
		
		
	}
	
}
