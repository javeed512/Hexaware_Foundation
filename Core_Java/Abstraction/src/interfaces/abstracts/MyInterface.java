package interfaces.abstracts;

public interface MyInterface {  // Java-8
	
	 int add(int a, int b);
	 
	 
	 public  static void  methodOne() {
		 
		 	System.out.println("static methodOne() is called...");
		 
	 }
	 
	 public default  void methodTwo() {
		 
		 System.out.println("default methodTwo() is called...");
		 
	 }
	 
	

}
