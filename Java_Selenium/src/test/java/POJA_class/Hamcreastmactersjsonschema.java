package POJA_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.Validate;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class Hamcreastmactersjsonschema {
	
	@Test
	public void ValidateSchema() throws IOException {

		File json = new File("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\resources\\Jsonformat");
		String readFileToString = FileUtils.readFileToString(json);
		File inputschema = new File("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\resources\\Schemafile ");
		MatcherAssert.assertThat(readFileToString, JsonSchemaValidator.matchesJsonSchema(inputschema));
		
	
	}

}
