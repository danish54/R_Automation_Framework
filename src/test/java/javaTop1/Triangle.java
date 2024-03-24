package javaTop1;

import org.testng.annotations.Test;

public class Triangle {

	@Test
	public void test1() throws Exception {

		int n = 5;

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j < n - i; j++) {

				System.out.print(" ");
			}
			for (int j = 0; j <=i*2; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
