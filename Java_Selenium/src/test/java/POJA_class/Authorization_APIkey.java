package POJA_class;

import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;

import io.restassured.RestAssured;

public class Authorization_APIkey {
	
	
	
	
	
	public void Apikey() {
		RestAssured.given()
		.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=c03a7f66e3ab0be6319b3abba56da290").prettyPrint();
		
	}
	
	public void parampass() {

		RestAssured.given().queryParam("q", "londan")
		.queryParam("appid", "c03a7f66e3ab0be6319b3abba56da290").get("https://api.openweathermap.org/data/2.5/weather?")
		.then().log().body();
		
	}
	
	public static void main(String[] args) {
		Authorization_APIkey api = new Authorization_APIkey();
		api.parampass();
	}

}
