package collection_Study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Mumbai");
		ll.add('M');
		ll.add(147);
		ll.add(147.47);
		ll.add(null);
		ll.add(147);
		ll.add(null);
		ll.add(true);
		
		System.out.println(ll);
		System.out.println("========================");
		System.out.println(ll.get(2));
		
		System.out.println(ll.lastIndexOf(147));
		
		System.out.println(ll.size());
		System.out.println("========================");
		System.out.println(ll.peek());
		System.out.println("========================");
		System.out.println(ll.peekFirst());
		System.out.println("========================");
		System.out.println(ll.peekLast());
		System.out.println("========================");
		System.out.println(ll);
		System.out.println("========================");
		System.out.println(ll.poll());
		System.out.println("========================");
		System.out.println(ll);
		System.out.println("========================");
		System.out.println(ll.pollFirst());
		System.out.println("========================");
		System.out.println(ll);
		System.out.println("========================");
		System.out.println(ll.pollLast());
		System.out.println("========================");
		System.out.println(ll);
		System.out.println("========================");
		System.out.println(ll.pop());
		System.out.println("========================");
		System.out.println(ll);
		System.out.println("========================");
		ll.add(0, "Mumbai");
		ll.add(1, 'M');
		System.out.println(ll);
		System.out.println("=========================");
		System.out.println("for loop output");
		for(int i=0;i<=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("=========================");
		System.out.println("for Each loop output");
		for(Object a:ll) {
			System.out.println(a);
			}
		System.out.println("=========================");
		System.out.println("iterator output");
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=========================");
		System.out.println("List iterator output");
		ListIterator li = ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("=================");
		System.out.println(li.hasNext());
		System.out.println("=================");
		System.out.println(li.hasPrevious());
		System.out.println("=================");
		System.out.println(li.previous());
		System.out.println("=================");
		System.out.println(li.previousIndex());
		System.out.println("=================");
	}

}
