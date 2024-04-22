package POJA_class;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class Using_Configuration {
	
	
	public void configurationfiles() throws IOException {
		File json = new File("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\java\\Json Format");
		Configuration configuration = Configuration.defaultConfiguration();
		configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		Object read = JsonPath.using(configuration).parse(json).read("$..yutype");
		System.out.println(read);
		
	}
	public static void main(String[] args) throws IOException {
		Using_Configuration us = new Using_Configuration();
		us.configurationfiles();
	}

}
