package unchecked.exceptions;

public class UncheckedExpDemo {

	public static void main(String[] args) { // caller

		System.out.println("Welcome Friends");

		try {

			int output = div(10, 5);

			String name = "javeed";  // null

			System.out.println("Length : " + name.length());
			
			
			//System.out.println(args[0]);  // reading element 1 
			

			System.out.println("Output : " + output);
			
			
			
			
		}

		catch (ArithmeticException e) {

			// e.printStackTrace();

			System.err.println("Sorry! you can't div number by zero");
		} catch (NullPointerException e) {

			e.printStackTrace();
			System.err.println("String reference holds null value");
		} catch (Exception e) {

			e.printStackTrace();
		}
		finally {
			
			// clear memory
			// close database connection
			// close files etc
			
			System.out.println("finally block executed ...");
		}
		
		

		System.out.println("Thank you visit again");

	}

	public static int div(int a, int b) throws ArithmeticException { // callee

		int result = a / b; // exp occur at runtime

		return result;

	}

}
