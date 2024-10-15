package custom.exception;

public class BankApp {

	public static void main(String[] args) {

		int  acno[] = {101,102,103,104,105};
		String name[] = {"king","smith","ford","tom","scott"};
		double balance[] = {4000 , 6000 , 5000,700,3000};
		
		for (int i = 0; i < acno.length; i++) {
			
			System.out.println(acno[i] +" "+name[i] +"  "+balance[i]);
			
			if(balance[i] < 1000) {
				
				try {
				throw  new LowBalanceException();
				}
				catch(LowBalanceException e) {
					
	System.err.println(name[i]+" please deposit some amount your balance low");
					 
				}
				
				
			}
			
			
		}
		
		
		
	}

}
