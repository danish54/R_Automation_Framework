package practise;

import java.io.IOException;

import org.testng.annotations.Test;

public class Exception1 {

	@Test
	public void testName() throws Exception {
		

	 
	   		try {
	   			throw new IOException("Hello");
	   		} catch(Exception e) {
	   			System.out.println(e.getMessage());
	   		}
	}
}
