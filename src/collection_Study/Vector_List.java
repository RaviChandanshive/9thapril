package collection_Study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_List {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("Ram");
		v.add("Rohit");
		v.add('M');
		v.add(123);
		v.add(12.32);
		v.add(null);
		v.add(123);
		v.add(null);
		v.add('A');
		System.out.println(v);
		System.out.println("=========================");
		System.out.println(v.indexOf("Rohit"));
		
		System.out.println(v.get(2));
		
		System.out.println(v.lastIndexOf(null));
		
		System.out.println(v.contains("Ram"));
	
		System.out.println(v.remove(5));
		System.out.println("=========================");
		
		System.out.println(v);
		System.out.println("=========================");
		v.add(5, "Add");
		System.out.println(v);
		System.out.println("=========================");
		System.out.println("for each loop output");
		for(Object A:v) {
			System.out.println(A);
		}
		System.out.println("=========================");
		System.out.println("iterator loop output");
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=========================");
		System.out.println("ListIterator loop output");
		ListIterator li = v.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("=========================");
		System.out.println("Enumeration loop output");
		Enumeration ele = v.elements();
		while(ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
	}

}
