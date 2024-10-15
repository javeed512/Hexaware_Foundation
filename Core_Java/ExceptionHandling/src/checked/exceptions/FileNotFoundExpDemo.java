package checked.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExpDemo {

	public static void main(String[] args) {


		
			try {
				Scanner scanner = new Scanner(new File("file1.txt"));
				
				String data = null;
				
				
				while(  (data = scanner.nextLine()) != null   ) {
				
					System.out.println(data);
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (Exception e) {

					System.err.println("End of File");
			}
		

	}

}
