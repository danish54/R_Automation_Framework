package practise;

import org.testng.annotations.Test;

public class ContainsTest {

	@Test
	public void concattesty() throws Exception {
		
		String s1 = "Danish";
		s1.contains("Danish");
		
		System.out.println(s1.contains("Da"));
	}
}
