package learnCoreJava.conditionalStatement;

import java.util.Scanner;

public class StudentChallengeYoungOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the person age: ");
		int age = sc.nextInt();
		
		if (age < 14 || age > 55) {
			System.out.println("The person is not young");
		}
		else{
			System.out.println("The person is young");
		}		
		sc.close();
	}
}
