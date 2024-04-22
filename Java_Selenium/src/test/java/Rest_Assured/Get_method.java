package Rest_Assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_method {
	
	//get method 
	@Test(enabled=false)
	public void Using_get_method() {
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification given = RestAssured.given();
		Response response = given.request(Method.GET,"");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	
	// get post
	
	@Test(enabled=false)
	public void Using_post_method() {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification given = RestAssured.given().header("Content-type","application/json").body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"leader\"\r\n"
			+ "}");
	Response request = given.request(Method.POST, "/api/users");
	System.out.println(request.getStatusLine());
	System.out.println(request.asPrettyString());
	
	}
	
	
	@Test(enabled=false)
	public void Using_put_method() {
	RestAssured.baseURI="https://reqres.in/api/users/2";
	RequestSpecification body = RestAssured.given().header("Content-type", "application/json").body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}");
     Response request = body.request(Method.PUT,"");
     System.out.println(request.asPrettyString());
     System.out.println(request.getStatusLine());
     
	}
	
	
	@Test
	public void Using_Delete_method() {
    RestAssured.baseURI="https://reqres.in/api/users/2";
    RequestSpecification given = RestAssured.given();
    Response request = given.request(Method.DELETE,"");
    System.out.println(request.statusLine());
    System.out.println(request.asPrettyString());
    
	}

}
