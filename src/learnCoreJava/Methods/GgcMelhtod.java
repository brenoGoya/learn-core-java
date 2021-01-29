package learnCoreJava.Methods;

public class GgcMelhtod {

	public static void main(String[] args) {
		
		
		System.out.println(gcd(35, 55));
	}

	
	static int gcd(int n, int m) {
		
		while (m != n) {
			if (m > n) m += - n;
			else n += - m;
		}
		return m;
	}
}
