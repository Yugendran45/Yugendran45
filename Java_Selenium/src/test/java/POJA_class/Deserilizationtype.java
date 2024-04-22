package POJA_class;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserilizationtype {

public void mapobject() throws StreamReadException, DatabindException, IOException {
		
		File file = new File("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\resources\\Jsonformat");
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		POJAclassone readValue = mapper.readValue(file,POJAclasstwo.class );
		System.out.println(readValue.getFirestname());
		System.out.println(readValue.getEmail());
		System.out.println(readValue.getLastname());
		System.out.println(readValue.getSkill());
	}
	
     public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
    	 Deserilizationtype d = new Deserilizationtype();
    	 d.mapobject();
	}
	
	
	
}
