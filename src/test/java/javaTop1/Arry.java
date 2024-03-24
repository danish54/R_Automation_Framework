package javaTop1;

import org.testng.annotations.Test;

public class Arry {

	@Test
	public void testName() throws Exception {

		
		int ary[][] = { 
				{ 2, 3, 1 },
				{ 5, 5, 9 }, 
				{ 7, 6, 4 } 
				
		};
		int min = ary[0][0];
		int mincolumn=0;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[0].length; j++) {
				
				if(ary[i][j]<min) {
					min =ary[i][j];
					 mincolumn=j;
				}
			}
			
		}
		int max = ary[0][mincolumn];
		for(int i=0; i<ary.length; i++) {
			if(ary[i][mincolumn]>max) {
				max = ary[i][mincolumn];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}
