package conditional;

public class NestedIf {

	public static void main(String[] args) {

		 int s = 3;
		 if (s > 10)
		 {
		 if (s % 2 == 0) {
			 int x = 9;
		 System.out.println ("s is even and greater than 10!");
		 }
		 else
		 System.out.println ("s is odd and greater than 10!");
		 }
		 else{
		 System.out.println ("s is less than 10");
		 }
		 System.out.println ("Hello World!");
  }
		
		
}


