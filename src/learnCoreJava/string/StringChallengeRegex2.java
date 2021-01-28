package learnCoreJava.string;

public class StringChallengeRegex2 {

	public static void main(String[] args) {
		
		String str = "a!B@c#1$2%3";
		
		String str1 = "    abc    de   fgh   ijk ";
		
		str1 = str1.replaceAll("\\s+", " ").trim(); 
		
		System.out.println(str);
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		
		System.out.println(str1);				
		String words[] = str1.split("\\s");
		System.out.println("Number of words: " + words.length);		
	}
	
}
