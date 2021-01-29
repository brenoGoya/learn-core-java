package learnCoreJava.Methods;

import java.util.Scanner;

public class FindNumberPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println(isPrime(number));

		sc.close();
	}

	static boolean isPrime(int n) {

		for (int i = 1; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
