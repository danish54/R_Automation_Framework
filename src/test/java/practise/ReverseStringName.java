package practise;

import org.testng.annotations.Test;

public class ReverseStringName {

	@Test
	public void testName() throws Exception {

		String name = "my name is danish";

		String rname = "";

		String[] sname = name.split(" ");

		for (String word : sname) {

			for (int i = word.length() - 1; i >= 0; i--) {

				rname = rname + word.charAt(i);

			}
			rname = rname + " ";

		}

		System.out.println(rname);
	}

}
