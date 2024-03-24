package practise;

import org.testng.annotations.Test;

public class ConcatTest {

	@Test
	public void testName() throws Exception {
		
		String x = "abc";
		String y = "bcd";
		
		String z=x.concat(y);
		System.out.println(x);
		System.out.println(z);
	}
}
