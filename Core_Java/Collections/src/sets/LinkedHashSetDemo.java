package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();// LinkedList + HashSet
										//DS: doubly linked list + hash table

		set.add(103);
		set.add(102);
		set.add(49);
		set.add(22);
		set.add(7);
		set.add(49);
		System.out.println(set);
		
		for (Integer i : set) {
			System.out.println(i);
		}
		
		
	}

}
