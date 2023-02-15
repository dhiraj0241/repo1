
package collectionUses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListUses {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<Object>();
		
		al.add("Velocity");
		al.add(456);
		al.add(23.32f);
		al.add("katraj");
		al.add(null);
		al.add(null);
		al.add(true);
		
		System.out.println(al);
		
		System.out.println("============================");
		//al.clear();
		//System.out.println(al);
		System.out.println("============================");
		
		al.clone();
		System.out.println(al);
		
		System.out.println("============================");
		
		al.add(4, "Naylesh");
		System.out.println(al);
		
		System.out.println("============================");
		
		System.out.println(al.contains("Naylesh"));
		System.out.println("============================");
		
		Object o = al.get(2);
		System.out.println(o);
		System.out.println("============================");
		
		
		int p = al.indexOf("katraj");
		System.out.println(p);
		
		System.out.println("============================");
		System.out.println(al.indexOf(true));
		
		System.out.println(al.size());
		
		System.out.println("==============By Using for loop==============");
		for (int i=0; i<=al.size()-1;i++) {
			
			System.out.println(al.get(i));
		}
		
		System.out.println("==============By Using iterator==============");
	     Iterator<Object> it = al.iterator();
	     
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
		
	    System.out.println("==============By Using list iterator==============");
	    
	    ListIterator<Object> li = al.listIterator();
	    
	    while (li.hasNext()) {
	    	System.out.println(li.next());
	    }
	    System.out.println("==============By Using for each==============");
	    for(Object a:al) {
	    	System.out.println(a);
	    }
	    
	    
	    
	}

}
