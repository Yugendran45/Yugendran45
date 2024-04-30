package Json_Annotation_package;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class main_class {
	
	
   public static void main (String[] args) throws JsonProcessingException {
	   
	   POJA1 js = new POJA1();
	   js.setEmail("yugendrankumar001@gmail.com");
	   js.setId(76);
	   js.setName("yugendran");
	   
	   ObjectMapper os = new ObjectMapper();
	   String writeValueAsString = os.writerWithDefaultPrettyPrinter().writeValueAsString(js);
	   System.out.println(writeValueAsString);
	   
	   
   }

}
