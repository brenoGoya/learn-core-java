package entitie;

import inteface.Member;

public class Custumer implements Member {

	 String name;
	
	 public Custumer (String n){
		name = n;
	}
	
	 public void callback() {
		System.out.println("Ok, I will, visit, " + name);
	}
}
