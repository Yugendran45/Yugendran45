package Project_test_sample;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Dweller_Management {
	
	// product
	@Test(priority=1)
	public void productpost() {
		RestAssured.given().baseUri("https://e902zlzwjb.execute-api.ap-south-1.amazonaws.com/products")
				.header("ContentType", "application/json")
				.body("{\\r\\n\"\r\n"
						+ "				+ \"  \\\"dwellerId\\\": \\\"5c9813a2-6c07-43af-a30f-6ff38c4993c3\\\",\\r\\n\"\r\n"
						+ "				+ \"  \\\"name\\\": \\\"snug\\\",\\r\\n\"\r\n"
						+ "				+ \"  \\\"description\\\": \\\"Parking System\\\",\\r\\n\"\r\n"
						+ "				+ \"  \\\"status\\\": \\\"Active\\\",\\r\\n\"\r\n"
						+ "				+ \"  \\\"type\\\": \\\"Software\\\",\\r\\n\"\r\n"
						+ "				+ \"  \\\"subType\\\": \\\"Sf\\\",\\r\\n\"\r\n"
						+ "				+ \"  \\\"version\\\": \\\"Version 1.0\\\"\\r\\n\"\r\n" + "				+ \"}")
				.when().post().prettyPrint();

	}

	@Test(priority=2)
	public void Productgetpost1() {
		RestAssured.given().baseUri("https://e902zlzwjb.execute-api.ap-south-1.amazonaws.com/products").when().get()
				.prettyPrint();
	}

	@Test(priority=3)
	public void Poductpost2() {
		RestAssured.given().body(
				"https://e902zlzwjb.execute-api.ap-south-1.amazonaws.com/products/e9e4e93c-a299-407b-99d3-34aad4c6480a")
				.when().get().prettyPrint();

	}

	// product feature

	@Test(priority=4)
	public void produvtfeaturepost() {
		RestAssured.given().baseUri("https://e902zlzwjb.execute-api.ap-south-1.amazonaws.com/productfeatures")
				.header("ContentType", "application/json")
				.body("{\r\n"
						+ "  \"name\": [\r\n"
						+ "    \"Dashboard\"\r\n"
						+ "  ],\r\n"
						+ "  \"dwellerId\": \"0a36ef23-896b-4819-8fbe-36480ff2f355\",\r\n"
						+ "  \"productId\": \"78ba3e7c-325b-42fc-8076-8d111fe91c50\",\r\n"
						+ "  \"parentId\": \"EER23\",\r\n"
						+ "  \"status\": \"Active\",\r\n"
						+ "  \"type\": \"Software\"\r\n"
						+ "}")
				.when().post().prettyPrint();

			}
	
	
         @Test(priority=5) 	
         public void Productfeatureget() {
        	 RestAssured.given().body("https://e902zlzwjb.execute-api.ap-south-1.amazonaws.com/productfeatures/f85a8a98-70fd-4ee5-8a0f-1c2f64b1e81d").
        	 when().get().prettyPrint();

		}
     
        @Test(priority=6)
        public void Productfeatureput() {
        RestAssured.given().baseUri("https://e902zlzwjb.execute-api.ap-south-1.amazonaws.com/producttypes/e99c5221-5a94-4809-a621-f0939a958302").
        header("ContentType", "application/json").body("{\r\n"
        		+ "  \"dwellerId\": \"0a36ef23-896b-4819-8fbe-36480ff2f355\",\r\n"
        		+ "  \"name\": \"Software\",\r\n"
        		+ "  \"description\": \"Source\"\r\n"
        		+ "}").when().patch().prettyPrint();
        }
        
        @Test(priority=7)
        public void productpatch() {
        RestAssured.given().baseUri("https://e902zlzwjb.execute-api.ap-south-1.amazonaws.com/producttypes/e99c5221-5a94-4809-a621-f0939a958302").
        header("ContentType", "application/json").body("{\r\n"
        		+ "  \"dwellerId\": \"0a36ef23-896b-4819-8fbe-36480ff2f355\",\r\n"
        		+ "  \"name\": \"Software\",\r\n"
        		+ "  \"description\": \"Ipuvi Software\"\r\n"
        		+ "}").when().put().prettyPrint();    	
        	
		}
        
        
        
        }

