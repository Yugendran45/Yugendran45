package Rest_Assured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.InvalidJsonException;
import com.jayway.jsonpath.JsonPath;

public class JWAY_Json_path {
	
	public void path_validate() throws IOException {
		File file = new File("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\java\\Json Format");
		Object read = JsonPath.read(file,"$..number");
		System.out.println(read);
	}
	
	
	
	public void parseonetime() throws InvalidJsonException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\java\\Json Format");
		
		Object parse = Configuration.defaultConfiguration().jsonProvider().parse(file.readAllBytes());
		System.out.println(parse);
		
		
	}
	
	public void Fluentapi() throws IOException {
		File file = new File("C:\\Users\\yugendran\\Desktop\\Workspace\\Java_Selenium\\src\\test\\java\\Json Format");
		DocumentContext parse = JsonPath.parse(file);
		Object read = parse.read("$");
		System.out.println(read);
		
	}
	 
	public static void main(String[] args) throws IOException {
		JWAY_Json_path js = new JWAY_Json_path();
		js.Fluentapi();
	}

}
