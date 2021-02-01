package abstractClass;

public class Rectangle extends Shape {
	
	double  breadth;
	double  lenght;
	
	@Override
	public double perimeter() {
		
		return 2 * (breadth + lenght);
	}
	
	@Override
	public double area() {
		
		return breadth * lenght;
	}
}
