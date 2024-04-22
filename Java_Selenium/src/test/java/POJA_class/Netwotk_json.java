package POJA_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class Netwotk_json {
	

	@Test
	public void Validate_Schema() throws IOException {
    
		ObjectMapper mapper = new ObjectMapper();
		JsonSchemaFactory factory= JsonSchemaFactory.getInstance(VersionFlag.V4);
		File json = new File("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\resources\\Jsonformat");
		InputStream inputschema = new FileInputStream("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\resources\\Schemafile ");
		JsonNode jsonnode = mapper.readTree(json);
		JsonSchema schema = factory.getSchema(inputschema);
		Set<ValidationMessage> validate = schema.validate(jsonnode);
		
		if(validate.isEmpty()) {
			System.out.println("No validation error");
		}else {
			
			for(ValidationMessage message : validate) {
				System.out.println(message);
			}
		}
			
		
	}

}
