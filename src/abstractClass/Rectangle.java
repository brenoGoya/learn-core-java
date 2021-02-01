package abstractClass;

public class Rectangle extends Shape {
	
	int breath;
	int lenght;
	
	@Override
	double perimeter() {
		int perimeter = 2* (breath + lenght);
		return perimeter;
	}
	@Override
	double area() {
		int area = breath * lenght;
		return area;
	}
	
	

}
