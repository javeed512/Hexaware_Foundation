package filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("User.properties");

			Properties prop = new Properties();

			prop.load(reader);

			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			String city =  prop.getProperty("city");
			
			String pincode = prop.getProperty("pincode");
			
			String mno =			prop.getProperty("mobileno");
			
			System.out.println("Username "+username);
			System.out.println("Password "+password);
			System.out.println("City "+city);
			System.out.println("Pincode "+pincode);
			
			System.out.println("Mobile no "+mno);
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
