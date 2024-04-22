package Rest_Assured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Json_copy_to_file {
	

	
	@Test
	public void Using_Json_file() {
		
		File json = new File("C:\\\\Users\\\\yugendran\\\\Desktop\\\\Workspace\\\\Java_Selenium\\\\src\\\\test\\\\java\\\\Json Format");
		RestAssured.given().baseUri("https://reqres.in/")
		.header("Conten-type","application/json")
		.body(json)
		.when().post("api/users").prettyPrint();
	}
	
	
}
