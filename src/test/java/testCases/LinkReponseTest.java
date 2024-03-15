package testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import pageobjects.HomePage;
import resources.BaseClass;
import resources.Utilities;

public class LinkReponseTest extends BaseClass{
	Utilities util;
	

	@Test(groups = "smoke", enabled = false)
	public void reponseTest() throws IOException {
		String urL = "https://rahulshettyacademy.com/brokenlink";
		URL uRl = new URL(urL);
		int codename = Utilities.geturlReponseTest(uRl);
		assertTrue(codename < 400, "Response code should be less than 400, but received: " + codename);
		System.out.println(codename);
	}

	@Test(enabled = false)
	public void SearchSort() {
		long cnt = Stream.of("Daniel", "Danish", "Ali", "Deccan", "Anam").filter(s -> s.startsWith("D")).count();
		System.out.println(cnt);
		String name = "danish ali is my name";

		System.out.println(name.substring(7));

		String[] nameSplit = name.split("\\s+");
		System.out.println(String.join("*", nameSplit));

	}

	@Test(enabled = false)
	public void Sorting123() {
		List<Integer> list = Arrays.asList(1,4,3, 2, 3, 4, 5);
		
		list.stream().distinct().sorted().forEach(s->System.out.println(s));
				
	}
	
	@Test(enabled = false)
	public void ListArry() {
		int[] a = {1,3,5,7,9,3,4,5};
		List<int[]> li = Arrays.asList(a);
				
		 for (int[] arr : li) {
	            // Print each element of the array
	            for (int num : arr) {
	                System.out.print(num + " ");
	            }
	            //System.out.println(); // Print a new line after each array
	        }
		
	}
	
	@Test(enabled = false)
	public void arraylist() {
		int[] numbers = {1, 2, 3, 4, 5}; 
		Arrays.sort(numbers);
		for (int i : numbers) {
			System.out.print(i+" ");
		}
		
	}
	
	@Test
	public void radioButtonCLick() {
		HomePage hom = new HomePage(util);
		hom.radiobuttonBoxClick();
	}

}
