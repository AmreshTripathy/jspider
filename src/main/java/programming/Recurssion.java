package programming;

import java.util.Scanner;

public class Recurssion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printHelloNTimes(n);
		System.out.println();
		print1ToN(n);
		System.out.println();
		printNTo1(n);
		System.out.println();
		printEven(n);
		System.out.println();
		System.out.println(printNSum(n));
		System.out.println();
		System.out.println(printCountEven(n));
		sc.close();
	}

	private static int printCountEven(int n) {
		if (n <= 0)
			return 0;
		
		if (n % 2 == 0)
			return 1 + printCountEven(n - 1);
		else
			return printCountEven(n - 1);
	}

	private static int printNSum(int n) {
		return (n <= 0) ? 0 : n + printNSum(n - 1);
	}

	private static void printEven(int n) {
		if (n == 0)
			return;
		
		printEven(n - 1);
		if (n % 2 == 0)
			System.out.println(n);
	}

	private static void print1ToN(int n) {
		if (n == 0)
			return;

		print1ToN(n - 1);
		System.out.println(n);
	}

	private static void printNTo1(int n) {
		if (n == 0)
			return;
		
		System.out.println(n);
		printNTo1(n - 1);
	}

	private static void printHelloNTimes(int n) {
		if (n == 0)
			return;
		
		System.out.println("Hello");
		printHelloNTimes(n - 1);
	}
}
