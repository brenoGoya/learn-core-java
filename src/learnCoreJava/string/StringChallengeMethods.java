package learnCoreJava.string;

public class StringChallengeMethods {

	public static void main(String[] args) {
		
		String str = "programmer@gmail.com";
		
		int i = str.indexOf("@");
		
		String userName = str.substring(0, i);
		String domain = str.substring(i + 1, str.length());
		
		System.out.println("User: " + userName);
		System.out.println("Domain: " + domain);
		
		int j = domain.indexOf(".");
		String domainName = domain.substring(0, j);
		System.out.println(domainName.equals("gmail"));	
	}
}
