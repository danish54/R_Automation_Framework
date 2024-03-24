package javaTop1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class FindMostFrequentChar {

	@Test
	public void testName() throws Exception {
		String s= "Banana";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			
			hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0)+1);
			
		}
		System.out.println(hash);
		char MAxfreqChar = '\0' ;
		int MaxFeq = 0;
		
		for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
			if(entry.getValue()>MaxFeq) {
				MaxFeq = entry.getValue();
				MAxfreqChar= entry.getKey();
			}
		}
		
		
		System.out.println(MAxfreqChar);
		
	}
	
	
	
}
