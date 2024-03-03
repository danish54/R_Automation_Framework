package testCases;

import java.io.IOException;
import org.testng.annotations.Test;

import resources.BaseClass;

public class Action_T extends BaseClass {

	@Test(groups = "Regression")
	public void RadioVutton_1() {
		
		System.out.println("RadioVutton_1");
	}
	@Test(groups = "smoke")
	public void RadioVutton_2() {
		System.out.println("RadioVutton_2");
	}
	@Test(groups = "Regression")
	public void RadioVutton_3() {
		System.out.println("RadioVutton_3");
	}
	
	@Test(groups = "Regression")
	public void RadioVutton_4() throws IOException {
		
		System.out.println("RadioVutton_4");
	}
}