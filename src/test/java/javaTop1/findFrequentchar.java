package javaTop1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class findFrequentchar {

	@Test
	public void Tst1() throws Exception {

		String s = "Selenium is my nae???";
		s = s.replaceAll("[^a-zA-Z0-9]", "");

		HashMap<Character, Integer> mo = new HashMap<Character, Integer>();

		char[] cha = s.toCharArray();

		for (char c : cha) {
			mo.put(c, mo.getOrDefault(c, 0) + 1);

		}
		System.out.println(mo);
		Set<Entry<Character, Integer>> entry = mo.entrySet();
		
		for(Map.Entry<Character, Integer> entry3: mo.entrySet()){
			
		}

		char mostfrequestChar = '\0';
		int frequency = 0;
		for (Entry<Character, Integer> entry2 : entry) {

			if (entry2.getValue() > frequency) {
				frequency = entry2.getValue();
				mostfrequestChar = entry2.getKey();
			}

		}
		
		char SecondmostfrequestChar = '\0';
		int secoondfrequency = 0;
		for (Entry<Character, Integer> entry2 : entry) {

			if (entry2.getValue() == frequency || entry2.getValue() > secoondfrequency) {
				secoondfrequency = entry2.getValue();
				SecondmostfrequestChar = entry2.getKey();
			}

		}
		
		

		System.out.println("Most Frequest => "+mostfrequestChar);
		System.out.println("Second Most Frequest => "+SecondmostfrequestChar);
	}

}
