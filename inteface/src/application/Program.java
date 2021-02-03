package application;

import entitie.Custumer;
import entitie.Store;

public class Program  {

	public static void main(String[] args) {

		Store s = new Store();
		Custumer c1 = new Custumer("John");
		Custumer c2 = new Custumer("Smith");
		
		s.register(c1);
		s.register(c2);
		
		s.inviteSale();
		
	}

}
