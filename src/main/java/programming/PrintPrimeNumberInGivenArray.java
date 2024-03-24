package programming;

import java.util.Scanner;

public class PrintPrimeNumberInGivenArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		sc.close();

		printPrimeFromArray(arr);
	}

	private static void printPrimeFromArray(int[] arr) {
		for (int num : arr)
			if (checkPrime(num))
				System.out.print(num + " ");
	}

	private static boolean checkPrime(int num) {
		if (num <= 1)
			return false;
		
		if (num == 2 || num == 3)
			return true;
		
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		
		for (int i = 5; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}
		
		return true;
	}
}
