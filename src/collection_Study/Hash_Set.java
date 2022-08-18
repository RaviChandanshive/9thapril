package collection_Study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add("Rahul");
		hs.add('R');
		hs.add(156);
		hs.add(156.45);
		hs.add(true);
		hs.add(null);
		hs.add(156);
		hs.add(null);
		System.out.println(hs);
		System.out.println("===================");
		
		System.out.println(hs.size());
		System.out.println("===================");
		System.out.println(hs.isEmpty());
		System.out.println("===================");
		System.out.println(hs.clone());
		System.out.println("===================");
		System.out.println(hs.remove(156));
		System.out.println("===================");
		System.out.println(hs);

		System.out.println("=========================");
		System.out.println("for Each loop output");
		for(Object f:hs) {
			System.out.println(f);
		}
		System.out.println("=========================");
		System.out.println("Iterator output");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		}
		

	}


