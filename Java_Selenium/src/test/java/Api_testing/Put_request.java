package Api_testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Put_request {
	
	public void putresponse() throws IOException {
		
		
		URL url = new URL("https://dummy.restapiexample.com/public/api/v1/update/21");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-type","application/json");
		connection.setDoOutput(true);
		String json ="{\"name\":\"test\",\"salary\":\"123\",\"age\":\"28\"}";
		byte[] bytes = json.getBytes();
	   OutputStream outputStream = connection.getOutputStream();
	   outputStream.write(bytes);
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
		Put_request ps = new Put_request();
		ps.putresponse();
		
		
	}
}
