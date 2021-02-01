package abstractClass;

public class Circle extends Shape {

	double radius;
	
	@Override
	double  perimeter() {
	 double perimeter =	2 * Math.PI * radius;
	return perimeter;
	}

	@Override
	double area() {
	  double area = Math.PI * radius * radius;
	  return area;		
	}
	
	
}
