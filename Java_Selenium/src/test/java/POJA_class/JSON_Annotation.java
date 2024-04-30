package POJA_class;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JSON_Annotation {
	
		public static void main(String[] args) throws JsonProcessingException {
			
			Map<String,Object> m = new HashMap<String,Object>();
			m.put("firest name", "Yugendran");
			m.put("last name", "K");
			m.put("Email", "Yugendrna");
			m.put("skills",Arrays.asList("java","selenium"));
			 ObjectMapper om = new ObjectMapper();
			 String writeValueAsString = om.writerWithDefaultPrettyPrinter().writeValueAsString(m);
			 
			 System.out.println(writeValueAsString);
			 
			
			
			
			
			
		}
		
		


}
