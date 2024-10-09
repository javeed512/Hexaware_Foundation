package interfaces.abstracts;

public class Test {

	public static void main(String[] args) {

		
		ChildRectangle  cr = new  ChildRectangle();
		
				cr.sayHello();
				cr.diameter();
				cr.getWidth();
				cr.getHeight();
				cr.toString();
		
		
	Rectangle  r = new  ChildRectangle();
	
			r.diameter();
			r.getWidth();
	
		
		Shape s =	new ChildRectangle();
		
			s.getWidth();
			s.getHeight();
			s.diameter();
			
			
		
		
	}

}
