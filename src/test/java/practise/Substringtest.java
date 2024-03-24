package practise;

import org.testng.annotations.Test;

public class Substringtest {
	
	@Test
	public void sbstr() {
		
		String s3 = "JournalDev";
		int start = 1;
		char end = 9;

		System.out.println(s3.substring(start,end));
		
	}

}
