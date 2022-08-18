package collection_Study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_List_Eg1 {

	public static void main(String[] args) {
		Vector<Character> vc=new Vector<>();
		vc.add('R');
		vc.add('A');
		vc.add('V');
		vc.add('I');
		vc.add('A');
		vc.add('B');
		vc.add('C');
		System.out.println(vc);
		System.out.println("=========================");
		System.out.println("for each loop output");
		for(Object A:vc) {
			System.out.println(A);
		}
		System.out.println("=========================");
		System.out.println("iterator loop output");
		Iterator it = vc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=========================");
		System.out.println("ListIterator loop output");
		ListIterator li = vc.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("=========================");
		System.out.println("Enumeration loop output");
		Enumeration el = vc.elements();
		while(el.hasMoreElements()) {
			System.out.println(el.nextElement());
		}

	}

}
