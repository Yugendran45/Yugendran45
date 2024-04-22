package Api_testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Post_request {
	
	
	public void creatrequest() throws IOException {
  
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection openConnection =(HttpURLConnection)url.openConnection();
		openConnection.setRequestMethod("POST");
		openConnection.setRequestProperty("Content-type", "application/json");
		openConnection.setDoOutput(true);
		String json = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
		
		byte[] bytes = json.getBytes();
		OutputStream outputStream = openConnection.getOutputStream();
		outputStream.write(bytes);
		System.out.println("Get response code"+openConnection.getResponseCode());
		System.out.println("Get response status"+openConnection.getResponseMessage());
		InputStream inputStream = openConnection.getInputStream();
		InputStreamReader inputstream = new InputStreamReader(inputStream);
       //Read the response data
		BufferedReader builder = new BufferedReader(inputstream);

		String l;
      // Looping the response code store the value
		StringBuffer buffer = new StringBuffer();
       // looping the response code 
		while ((l = builder.readLine()) != null) {
			buffer.append(l);

		}

		System.out.println(buffer);
	  	
	}
	
	public static void main(String[] args) throws IOException { 
		
		Post_request pr = new Post_request();
		pr.creatrequest();
		
	}

}
