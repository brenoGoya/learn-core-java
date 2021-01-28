package learnCoreJava.conditionalStatement;

import java.util.Scanner;

public class StudentChallengeEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Enter a integer number: ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("The number: " + n + " is EVEN");
		}
		else {
			System.out.println("The number: " + n + " is ODD" );
		}
		sc.close();
	}

}
