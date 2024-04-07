package seleniumClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide_Multidimensional {

	@DataProvider
	public Object [][] getData() {
		
		Object[][] obj = {{"Danish", "Haider", "Mazhar"}}; 
		return obj;
	}

	@Test(dataProvider = "getData")
	public void testsyso(String str1, String str2, String str3) throws Exception {

		System.out.println(str1+str2+str3);
	}

}
