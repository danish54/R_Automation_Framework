package stringTEst;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ShortSet1 {

	@Test
	public void testName() throws Exception {
		HashSet<Short> shortSet = new HashSet<Short>();

		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove ((short)(i - 1));
		}

		System.out.println(shortSet.size());
		for (Iterator<Short> iterator = shortSet.iterator(); iterator.hasNext();) {
			Short short1 = (Short) iterator.next();
			System.out.println(short1);
			
		}
		
	}
}
