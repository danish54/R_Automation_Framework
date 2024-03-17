package stringTEst;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplocateLetter {

	String name = "dell";
	String fname = "";

	@Test
	void namedell() {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
			}

		}
		for (Character character : set) {
			fname = fname + character;
		}

		System.out.println(fname);
	}

}
