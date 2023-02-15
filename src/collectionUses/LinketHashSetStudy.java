package collectionUses;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinketHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		lhs.add("Mumbai");
		lhs.add("Pune");
		lhs.add("AhmedNagar");
		lhs.add("Nagpur");
		lhs.add("Thane");
		lhs.add(null);
		lhs.add(null);
		lhs.add("Delhi");
		lhs.add("Delhi");
		
		System.out.println(lhs);
		
		System.out.println("========for each=========");
		
		for(Object l:lhs)
		{
			System.out.println(l);
		}
		
		System.out.println("========BY Using Iterator=========");

		Iterator<Object> it = lhs.iterator();
		
	while(it.hasNext()) {
		
		System.out.println(it.next());
			
	}
	}

}
