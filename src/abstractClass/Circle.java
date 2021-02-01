package abstractClass;

public class Circle extends Shape {

	double radius;
	
	@Override
	public double  perimeter() {
		
		return 2 * Math.PI * radius;
	}

	@Override
	public double area() {
		
		return Math.PI * radius * radius;		
	}
	
	
}
