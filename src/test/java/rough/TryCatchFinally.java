package rough;

import org.testng.annotations.Test;

public class TryCatchFinally {

	@Test
	public void testname1() throws Exception {

		try {

			System.exit(0);

		} finally {
			System.out.println("In Finally");
		}
	}
}
