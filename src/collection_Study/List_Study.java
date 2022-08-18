package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_Study {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Chandanshive");
		al.add('M');
		al.add(1997);
		al.add(68.55);
		al.add(null);
		al.add(null);
		al.add(true);
		System.out.println(al);
		System.out.println("=========================");
		System.out.println(al.indexOf("Ravi"));
		
		System.out.println(al.get(2));
		
		System.out.println(al.lastIndexOf(null));
		
		System.out.println(al.contains("Ravi"));
	
		System.out.println(al.remove(3));
		System.out.println("=========================");
		
		System.out.println(al);
		System.out.println("=========================");
		al.add(3, 'A');
		
		System.out.println(al);
		System.out.println("=========================");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println(al.get(6));
		System.out.println(al.get(7));
		System.out.println(al.get(8));
		System.out.println("=========================");
		
		for(int i=0;i<=8;i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=========================");
		System.out.println("for loop output");
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=========================");
		System.out.println("for each loop output");
		
		for (Object M: al) {
			System.out.println(M);
		}
		System.out.println("=========================");
		System.out.println("iterator loop output");
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=========================");
		System.out.println("List Iterator loop output");
		
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		  
	}

}
