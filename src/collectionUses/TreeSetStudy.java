package collectionUses;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {


	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet<>();
		
//		 Here whatever datatype object is added to the first element, 
//		 it then becomes the datatype for the whole array.
//		 eg if we add first element as String then the whole
//		 array object will be of string only by default.
//		Null Values and duplicates are not allowed.
//      It is sorted type By default
		
		t.add("Mumbai");
		t.add("Pune");
		t.add("Nagpur");
		t.add("Chandrapur");
		t.add("Amravati");
		
		System.out.println(t);
		System.out.println("=======================");
		
		System.out.println(t.first());
		System.out.println(t);
		System.out.println("=======================");
		
		System.out.println(t.last());
		System.out.println(t);
		System.out.println("=======================");
		
		
//		System.out.println(t.ceiling("Mumbai"));
//		
//		System.out.println(t.floor("Mumbai"));
//		
		System.out.println("======================");
		
		System.out.println(t.higher("Mumbai"));
		
		System.out.println(t.lower("Mumbai"));
		
		System.out.println("=========By using For each==========");
		
		for(Object fo:t)
		{
			System.out.println(fo);
		}
		
		System.out.println("=========By Using Iterator====================");
		
		Iterator<Object> it = t.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		

	}

}
