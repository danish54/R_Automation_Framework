package seleniumClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide_singledimension {

	@DataProvider
	public Object [] getData() {
		
		Object[] obj = {"Danish", "Haider", "Mazhar"}; 
		return obj;
	}

	@Test(dataProvider = "getData")
	public void testsyso(String str) throws Exception {

		System.out.println(str);
	}

}
