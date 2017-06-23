import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class RandomGenerator {	
	
	
	//METHODS
	public static int RandomNumberCreate() {
		StringBuilder sb = new StringBuilder();
        try {
            String randomAPIUrl = "https://www.random.org/integers/?num=10&min=1&max=600000000&col=1&base=10&format=plain&rnd=new";
            URL url = new URL(randomAPIUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json"); 

            if (connection.getResponseCode() != 200) {
                throw new RuntimeException(
                        "Request Failed! HTTP_ERROR_CODE is : " + connection.getResponseCode());
            }
            
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));            
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + " ");
            }
            br.close();            
            System.out.println(sb.toString()); 
            connection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		//return Integer.valueOf(sb.toString());
        return 0;
    }	    	  	    	    
}
