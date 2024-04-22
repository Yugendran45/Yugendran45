package Rest_Assured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Serilation {
	
	
	@Test
	public void Put_Serilation() {
     
	Map<String,Object>	m = new HashMap<String,Object>();
	
	ArrayList<String > al = new ArrayList<String>();
	al.add("java");
	al.add("selenium");
	
	m.put("Firest name", "Yugendran");
	m.put("Last name", "K");
	m.put("Email", "yugnedrankumar001@gmail.com");
	m.put("skills", al);
	
	System.out.println(m);
	
	RestAssured.given().baseUri("https://reqres.in").header("Content-type","application/json")
	.body(m).log().all()
	.when().post("/api/users").then().log().all();	
	}
	

}
