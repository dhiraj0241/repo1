package collectionUses;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistStudy {

	public static void main(String[] args) {
		
		LinkedList<Object> ll=new LinkedList<>();
		
		ll.add("Hii");
		ll.add("Hello");
		ll.add('k');
		ll.add(null);
		ll.add(null);
		ll.add(23.33f);
		ll.add(true);
		
		System.out.println(ll);
		System.out.println("========================");
		
		ll.add(4,"Fine");
		System.out.println(ll);
		System.out.println("========================");
		
		ll.addFirst("New");
		ll.addLast("Old");
		System.out.println(ll);
		System.out.println("=========================");
		
//		ll.clear();
//		System.out.println(ll);
		
		System.out.println(ll.clone());
		System.out.println("=========================");
		
		System.out.println(ll.contains("Fine"));
		System.out.println("==========================");
		
	    System.out.println(ll.element());
	    System.out.println(ll);
	    System.out.println("==========================");
	    
	    System.out.println(ll.get(5));
	    System.out.println(ll);
	    System.out.println("==========================");
	    
	    System.out.println(ll.getFirst());
	    System.out.println("==========================");
		
	    System.out.println(ll.getLast());
	    System.out.println("==========================");
	    
	    ll.offer("Last");
	    System.out.println(ll);
	    System.out.println("==========================");
	    
	    System.out.println(ll.peek());
	    System.out.println(ll);
	    System.out.println(ll.peekFirst());
	    System.out.println(ll.peekLast());
	    System.out.println(ll);
	    System.out.println("==========================");
	    
	    System.out.println(ll.poll());
	    System.out.println(ll);
	    System.out.println(ll.pollFirst());
	    System.out.println(ll);
	    System.out.println(ll.pollLast());
	    System.out.println(ll);
	    System.out.println("==========================");

		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println("==========================");
		
		ll.push("SambhajiNagar");
		System.out.println(ll);
		System.out.println("==========================");
		
		ll.remove();
		System.out.println(ll);
		System.out.println("==========================");

		System.out.println("====Traversing ====");
		
		System.out.println("=====BY using For loop=====");
		
		for(int i=0;i<=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("=====By using For each=====");
		for (Object l:ll) {
			System.out.println(l);
		}

		System.out.println("=========By using Iterator=====");
		
		Iterator<Object> tt = ll.iterator();
		
		while (tt.hasNext())
		{
			System.out.println(tt.next());
		}
		
		System.out.println("=========By using List Iterator=====");
		
		ListIterator<Object> lt = ll.listIterator();
		
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
	}
	}


