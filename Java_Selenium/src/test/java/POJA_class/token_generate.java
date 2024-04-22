package POJA_class;

import io.restassured.RestAssured;

public class token_generate {
	
	public void tokengenerate() {
		RestAssured.given().header("Authorization","token").get("https://github.com/Yugendran45/Automation-code-practice").prettyPrint();
	}
	
	
	public static void main(String[] args) {
		token_generate bt = new token_generate();
		bt.tokengenerate();
		
	}

}
