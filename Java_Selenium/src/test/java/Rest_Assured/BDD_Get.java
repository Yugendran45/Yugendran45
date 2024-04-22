package Rest_Assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BDD_Get {
	
	
	
	@Test(enabled = false)
	public void get_Bdd_method() {
		RestAssured.given().baseUri("https://reqres.in/").when().get("api/users?page=2").prettyPrint();
	}

	@Test(enabled = false)
	public void Post_Bdd_method() {
		RestAssured.given().baseUri("https://reqres.in/").header("Content-type", "application/json")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}").when()
				.post("/api/users").prettyPrint();

	}

	@Test(enabled = false)
	public void put_Bdd_method() {
		RestAssured.given().baseUri("https://reqres.in").header("Content-type", "application/json")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
				.put("/api/users/2").prettyPrint();

	}

	@Test
	public void Delete_Bdd_method() {
		RestAssured.given().baseUri("https://reqres.in").when().delete("/api/users/2").prettyPrint();

	}
}
