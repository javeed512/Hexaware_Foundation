package primitive.datatypes;

import java.lang.*;

public class PrimitiveDataTypes extends Object {

	public static void main(String[] args) {

		byte b1 = 50; // 1 byte
		short s1 = (short) 90;
		int n1 = 100;
		long ln = (long) 2000;

		float f = 4.555F;
		double d = 0.00000000000001;

		char ch = 'A';

		boolean bl = true;

		char c1 = (char) 65; // here implicit type casting

		System.out.println(c1);

		byte b2 = (byte) 130; // here explicit typecasting

		System.out.println("b2 value : " + b2);

		long l2 = 999998887772222L;

		String str1 = new String("javeed"); // non primitive or reference datatype

		Object o1 = new Object();

		Integer i = new Integer(40);

		Integer j = 10; // new Integer(10); // Auto Boxing

		int x = Integer.valueOf(i);

		int x1 = i;

	}

	public void m1(int x, int y) {

		int id;

		String name = "hello";

		System.out.print(name);

	}

}
