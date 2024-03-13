package rough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import org.testng.annotations.Test;

public class ColloectinJava {
	
	@Test
	public void Hasmapp() {
		HashMap<String, String> has = new HashMap<String, String>();
		
		has.put("Danish", "Ali");
		has.put("Anam", "Ali");
		has.get("Danish");
		
		System.out.println(has.get("Danish"));
	}
	
	@Test
	public void HasTable1() {
		Hashtable<String, String> htab = new Hashtable<String, String>();
		
		htab.put("Danish", "Pulser");
		
		System.out.println(htab.get("Danish"));
	}
	@Test
	public void ArayList1() {
		
		ArrayList<String> arlist = new ArrayList<String>();
		
		arlist.add("Danish");
		arlist.add("Anam");
		arlist.add("Mazhar");
		arlist.add("Haider");
		
		for (String string : arlist) {
			System.out.println(string);
		}
		
		
			}
	
}
