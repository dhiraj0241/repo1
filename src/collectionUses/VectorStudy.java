package collectionUses;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class VectorStudy {

	public static void main(String[] args) {
		
		
		Vector<Object> v = new Vector<>();
		
		v.add("Mumbai");
		v.add("City");
		v.add("Beautiful");
		v.add(null);
		v.add(true);
		v.add(99.98f);
		v.add(null);
		v.add(100);
		
		
		System.out.println(v);
		System.out.println("===========================");
		System.out.println(v.capacity());
		System.out.println("===========================");
		
//		v.clear();
//		System.out.println(v);
		
		v.clone();
		System.out.println(v);
		System.out.println("===========================");
		
		System.out.println(v.contains("Beautiful"));
		System.out.println("===========================");
		
		System.out.println(v.elementAt(0));
		System.out.println("===========================");
		
		System.out.println(v.firstElement());
		System.out.println("===========================");
		
		System.out.println(v.get(7));
		System.out.println("===========================");
		
		System.out.println(v.indexOf("Beautiful"));
		System.out.println("===========================");

		System.out.println(v.isEmpty());
		System.out.println("===========================");
		
		v.set(2, 123.44f);
		System.out.println(v);
		
		System.out.println("============================");
		
		v.setElementAt("Tarak", 4);
		System.out.println(v);
		
		System.out.println("=========for loop========");
		
		for (int i=0; i<=v.size()-1; i++) {
			
			System.out.println(v.get(i));
		}
		
		System.out.println("=========for each loop========");
		
		for(Object m:v) {
			System.out.println(m);
			
		System.out.println("=========By using Iterator========");
		
		Iterator<Object> it = v.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			
		System.out.println("=============By using List Iterator========");
		
		 ListIterator<Object> li = v.listIterator();
		 while (li.hasNext()) {
			 System.out.println(li.next());
		 }
		 
		 System.out.println("========By enumeration============");
		 Enumeration<Object> en = v.elements();
		 while(en.hasMoreElements()) {
			 System.out.println(en.nextElement());
		 }	
		 
		 
		}			
		}
	}

}
