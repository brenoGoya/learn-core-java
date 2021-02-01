package inheritance.overRiding;

public class OverridingCar {

	public static void main(String[] args) {
		
		Car c = new LuxaryCar();
		
		c.start();
		c.accelerate();
		c.changeGear();
//		c.openRoof();
	}

}
