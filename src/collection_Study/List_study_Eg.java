package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_study_Eg {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(12);
		al.add(321);
		al.add(21);
		al.add(56);
		al.add(85);
		al.add(89);
		al.add(75);
		System.out.println(al);
		
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
