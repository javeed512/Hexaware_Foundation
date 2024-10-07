package conditional;

import java.lang.*;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		
			Scanner sc  = new Scanner(System.in);
			
			System.out.println("Enter your favourite color");
		
			String  choice =  sc.next();  // read single string from KB
		
			switch(choice) {
			
			case  "red":  // int,string,char
					System.out.println("Red Color selected");
			
					break;
					
			case "blue":
					System.out.println("Blue Color selected");
					
					break;
					
			case "green":
				System.out.println("Green Color selected");
				
				break;
				
			default:
					System.err.println("Invalid option");
			
			}
			
		
		

	}

}
