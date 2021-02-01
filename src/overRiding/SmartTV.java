package inheritance.overRiding;

public class SmartTV extends TV {	

	@Override	
	public void switchOn() {
		System.out.println("Smart TV Switched ON");
	}
	
	@Override
	public void changeChannel() {
		System.out.println("Smart TV Channel is Changed");		
	}
	
	public void browse() {
		System.out.println("Smart TV Browsing");
	}
}
