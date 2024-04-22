package POJA_class;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Json_Schema_validater {
	
	
	
	@Test
	public void schemaclasspath() {
		
		File json = new File("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\resources\\Jsonformat");
		RestAssured.given().baseUri("https://reqres.in/")
		.header("Content-type","application/json").body(json)
		.when().post("/api/users")
		.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schemafile"));
		
	}

}
