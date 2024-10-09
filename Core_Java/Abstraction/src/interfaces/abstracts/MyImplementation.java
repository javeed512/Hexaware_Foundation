package interfaces.abstracts;

public class MyImplementation implements  MyInterface{

	public static void main(String[] args) {

		
		MyInterface.methodOne();  // static

	MyInterface mi =	new MyImplementation();
		
				mi.methodTwo();  // default
		
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

}
