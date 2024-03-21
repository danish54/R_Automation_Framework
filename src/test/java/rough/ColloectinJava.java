package rough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class ColloectinJava {

	@Test
	public void Hasmapp() {
		HashMap<String, String> has = new HashMap<String, String>();

		has.put("Danish", "Ali");
		has.put("Anam", "Ali");
		has.put("Haider", "Ali");
		has.put("Mazhar", "Ali");

		Iterator<Map.Entry<String, String>> it = has.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();

			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println("Key: " + key + ", Value: " + value);
		}
	}

	@Test
	public void Treeemapp() {

		TreeMap<String, String> str = new TreeMap<String, String>();

	}

	@Test
	public void TreeeSet() {
		TreeSet<String> tre = new TreeSet<String>();
	}

	@Test
	public void HasSt() {

		HashSet<String> str = new HashSet<String>();
		str.add("Danish");
		str.add(null);
		for (String string : str) {

			System.out.println(string);
		}
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

		Iterator<String> str = arlist.iterator();
		while (str.hasNext()) {

			System.out.println("ArrayList =>" + str.next());

		}
	}

	@Test
	public void FOrEachLoop() throws Exception {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);

		}
		list.forEach(System.out::println);
	}

}
