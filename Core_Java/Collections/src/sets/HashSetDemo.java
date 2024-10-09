package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		// HashSet insert elements based on Hashcode order
		
		// HashSet uses hash table DS

		Set<Integer> set = new HashSet<Integer>();

		set.add(103);
		System.out.println(set.add(102));
		set.add(49);
		set.add(22);
		set.add(7);
		System.out.println(set.add(102)); // duplicate not allowed
		set.add(null);

		System.out.println(set);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			Integer n1 = it.next();

			System.out.println(n1);
		}

	}

}
