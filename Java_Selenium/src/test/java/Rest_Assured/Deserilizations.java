package Rest_Assured;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJA_class.POJAclassone;

public class Deserilizations {
	
	public void mapobject() throws StreamReadException, DatabindException, IOException {
		
		File file = new File("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\resources\\Jsonformat");
		
		ObjectMapper mapper = new ObjectMapper();
		POJAclassone readValue = mapper.readValue(file,POJAclassone.class );
		System.out.println(readValue.getFirestname());
		System.out.println(readValue.getEmail());
		System.out.println(readValue.getLastname());
		System.out.println(readValue.getSkill());
	}
	
	
	public static void main(String[] args) throws  DatabindException, IOException {
		Deserilizations d = new Deserilizations();
		d.mapobject();
	}

}
