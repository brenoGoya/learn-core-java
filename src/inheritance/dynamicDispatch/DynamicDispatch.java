package inheritance.dynamicDispatch;

public class DynamicDispatch {

	public static void main(String[] args) {

		Super s = new Sub();		
		
		s.method1();
		s.method2();			
	}
}
