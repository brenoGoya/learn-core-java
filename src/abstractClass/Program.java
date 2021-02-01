package abstractClass;

public class Program {

	public static void main(String[] args) {

	Rectangle r = new Rectangle();
	r.lenght = 10;
	r.breadth = 5;
	
	System.out.println("Rectangle area: " + r.area());
	System.out.println("Rectangule perimeter: " + r.perimeter());
	
	Circle c = new Circle();
	c.radius = 3;
	
	System.out.println("Circle area: " + c.area());
	System.out.println("Circle perimeter: " + c.perimeter());
		
	Shape s = r;
	
	System.out.println(s.area()); 
	
	}

}
