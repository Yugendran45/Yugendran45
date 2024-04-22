package Api_testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Get_Request {
	
	public void requestmethod() throws IOException {

		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
		openConnection.setRequestMethod("GET");
		openConnection.connect();
		int responseCode = openConnection.getResponseCode();
		System.out.println("Status code" + responseCode);
		String responseMessage = openConnection.getResponseMessage();
		System.out.println(responseMessage + responseCode);
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
		Get_Request g = new Get_Request();
		g.requestmethod();
	}

}
