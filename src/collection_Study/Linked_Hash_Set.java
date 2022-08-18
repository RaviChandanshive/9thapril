package collection_Study;

import java.util.LinkedHashSet;

public class Linked_Hash_Set {

	public static void main(String[] args) {
		LinkedHashSet ls=new LinkedHashSet();
		
		ls.add("Ravi");
		ls.add('C');
		ls.add(148);
		ls.add(124.65);
		ls.add(true);
		ls.add(null);
		ls.add(148);
		ls.add(null);
		
		System.out.println(ls);

	}

}
