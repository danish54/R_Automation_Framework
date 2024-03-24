package javaTop1;

import org.testng.annotations.Test;

public class ReverserEachLetter {

	@Test
	public void testName() throws Exception {
		String name = "Danish Ali";
		String rev = "";
		String[] s = name.split("\\s+");
		for (String word : s) {
			for (int i = word.length() - 1; i >= 0; i--) {
				rev =rev+word.charAt(i);
			}
			rev = rev + " ";
		}
		System.out.println(rev);
	}

}
