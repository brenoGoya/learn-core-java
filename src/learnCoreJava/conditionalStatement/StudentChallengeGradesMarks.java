package learnCoreJava.conditionalStatement;

import java.util.Scanner;

public class StudentChallengeGradesMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the three grades:");
		
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		float m3 = sc.nextFloat();
		
		float total = m1 + m2 + m3;
		float average = total / 3;
		
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		
		if (average >= 70.0) {
			System.out.println("A");
		}
		else if(average >= 60.0) {
			System.out.println("B");
		}
		else if (average >= 50.0) {
			System.out.println("C"); 
		}
		else if(average >= 40.0) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		sc.close();
	}
}
