package interfaces.abstracts;

public abstract   class Rectangle extends Object implements  Shape{

	
	
	
	
	@Override
	public int getHeight() {
		
		System.out.println("Finding Height");
		
		return 100;
	}

	@Override
	public int getWidth() {

			System.out.println("Finding Width");
		
		return 2000;
	}

	
	public abstract  int  diameter();
	
	
	
}
