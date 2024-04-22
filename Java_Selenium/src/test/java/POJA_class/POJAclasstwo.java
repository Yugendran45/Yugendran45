package POJA_class;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJAclasstwo extends POJAclassone {
	
	public static void main(String[] args) throws JsonProcessingException {
		POJAclassone pa = new POJAclassone();
		pa.setFirestname("yugendrna");
        pa.setLastname("k");
        pa.setEmail("yugendrankumar001@gmail.com");
        pa.setSkill(Arrays.asList("java","selenium","cucumber"));	
        
        
        System.out.println(pa.getFirestname());
        System.out.println(pa.getLastname());
        System.out.println(pa.getEmail());
        System.out.println(pa.getSkill());
        ObjectMapper map = new ObjectMapper();
        String s = map.writerWithDefaultPrettyPrinter().writeValueAsString(pa);
        System.out.println(s);
        
	}

}
