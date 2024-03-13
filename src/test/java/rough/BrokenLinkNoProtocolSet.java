package rough;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class BrokenLinkNoProtocolSet {

	
	
	Set<String> alllinks = new HashSet<String>();
	
	@Test
	public void NoOri(){
		alllinks.add("http://www.medianhconsulting.com/");
		alllinks.add("http://www.medianhconsulting.com");
		
		for (String string : alllinks) {
			try {
			URL url = new URL(string);
			HttpURLConnection connct = (HttpURLConnection) url.openConnection();
			connct.setRequestMethod("HEAD");
			int code = connct.getResponseCode();
			System.out.println(code);
			connct.disconnect();
			}
		
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
