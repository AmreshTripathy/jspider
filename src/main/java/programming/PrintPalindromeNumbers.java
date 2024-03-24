package programming;

import java.util.Scanner;

public class PrintPalindromeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		sc.close();
		
		printPalindromeFromArray(arr);
	}

	private static void printPalindromeFromArray(int[] arr) {
		for (int num : arr)
			if (checkPalindrome(num))
				System.out.print(num + " ");
	}

	private static boolean checkPalindrome(int num) {
		return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString()) == num;
	}
}
