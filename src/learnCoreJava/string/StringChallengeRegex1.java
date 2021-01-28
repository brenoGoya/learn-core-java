package learnCoreJava.string;

public class StringChallengeRegex1 {

	public static void main(String[] args) {
		
		int bin = 10;		
		String hexaDecimal = "AB39AD29";
		String str = String.valueOf(bin);
		String d = "01/12/2021";		
		
		System.out.println(str);
		System.out.println(str.matches("[01]+"));
		System.out.println(hexaDecimal);
		System.out.println(hexaDecimal.matches("[0-9A-F]+"));
		System.out.println(d);
		System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));		
	}

}
