package conditional;

public class IfElseDemo {

	public static void main(String[] args) {


		int age = 101;
		
			if(age < 18)	{
				
				System.out.println("You are not eligible for Course");
				
				
			}
		
			else if(age>18 &&  age<=99) {
				
				
				System.out.print("Your are eligible ");
				
			}
			
			else {
				
				System.err.println("Sorry");
				
			}
			
			

	}

}
