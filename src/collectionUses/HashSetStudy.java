package collectionUses;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<>();
		
		hs.add("Maths");
		hs.add("Physics");
		hs.add("Chemistry");
		hs.add("Biology");
		hs.add("English");
		hs.add("Hindi");
		hs.add("Hindi");
		hs.add(null);
		hs.add(null);
		hs.add(true);
		hs.add(89.99f);
		
		System.out.println(hs);
		
		System.out.println("========For Loop=========");
		// we can't use for loop in this because there is no get method.
		
		System.out.println("========FOR Each loop=======");
		for (Object h:hs) {
			System.out.println(h);
		}

		System.out.println("========BY Using Iterator=======");
		
		Iterator<Object> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
	}
}
