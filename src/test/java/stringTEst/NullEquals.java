package stringTEst;

import org.testng.annotations.Test;

public class NullEquals {

	@Test
	public void testName() throws Exception {
		String str = "adas";
		String str1="abc";

		System.out.println(str1.equals("abc") & str.equals("das"));
	}
}
