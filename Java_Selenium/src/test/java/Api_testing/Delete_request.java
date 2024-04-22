package Api_testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Delete_request {

	
public void deleteresponse() throws IOException {
		
		
		URL url = new URL("https://dummy.restapiexample.com/public/api/v1/delete/2");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-type","application/json");
		connection.setDoOutput(true);
		 System.out.println(connection.getResponseCode());
	   System.out.println(connection.getResponseMessage());	
	   
	   InputStream inputStream = connection.getInputStream();
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
	
	Delete_request d = new Delete_request();
	d.deleteresponse();
	
}
  

}
