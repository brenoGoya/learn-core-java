package learnCoreJava.conditionalStatement;

import java.util.Scanner;

public class RadixOfNumberString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		String number = sc.nextLine();
		
		if (number.matches("[01]+")) {
			
			System.out.println("Binary");
		}
		else if (number.matches("[0-7]+")) {
			
			System.out.println("Octal");
		}
		else if  (number.matches("[0-9]+")) {
			
			System.out.println("Decimal");
		}
		else if (number.matches("[0-9A-F]+")) {
			
			System.out.println("Hexadecimal");
		}
		else {
			
			System.out.println("Invalid number");
		}
		
		sc.close();
	}

}
