package interfaces.abstracts;

public class ChildRectangle extends Rectangle{

	
	public ChildRectangle() {
		super(); // Rectangle()
		
	}
	
	
	@Override
	public int diameter() {
		
		System.out.println("No diameter for rectangle");
		
		return 0;
	}
	
	
	public String sayHello(){
		
		return "hello friends";
		
	}

}
