package final_static;

public final  class FinalDemo { // not possible to extend
	
	final int  ID =0;

	public static void main(String[] args) {


	 final	 int X = 99;  // cannot be re initialized
	 
	 	X =1000;
		

	}
	
	public final void m1() { // not possible to override
		
		System.out.println("Hello m1()");
		
	}
	
	
	
	
	

}


class final Hello  extends FinalDemo{
	
	
	public void m1() {
	System.out.println("Hello from child");
	}
	
}