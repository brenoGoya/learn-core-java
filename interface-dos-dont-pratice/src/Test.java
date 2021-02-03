
public interface Test {

	
	
	// Identifier are in UPPER CASE and by default is final static  (CONSTANT)
	int X = 10;	
	final static int  Y = 11;
	
	// By default methods are public and abstract
	// Methods can not be private
	// Methods can have body if they are static
	
	void meth1();
	
	public abstract void meth2();
	
	default void meth3() {
		System.out.println("Meth3 of Test");
	}
	
}
