package javaTop1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleDate1 {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/y");
		sdf.format(d);
		System.out.println(sdf.format(d));

	}

}
