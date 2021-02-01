package inheritance.overRiding;

public class OverrindingTV {

	public static void main(String[] args) {
		
		TV t = new SmartTV();
		
		t.switchOn();		
		t.changeChannel();
	}
}
