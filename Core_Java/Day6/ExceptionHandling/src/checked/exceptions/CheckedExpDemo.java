package checked.exceptions;

public class CheckedExpDemo {

	public static void main(String[] args) {  // main thread


		System.out.println("Hello friends");
		
		try {
			Thread.sleep(2000); // 2 sec pause
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank you");
		
		

	}

}
