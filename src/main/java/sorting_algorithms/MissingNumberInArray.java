package sorting_algorithms;

import java.util.Scanner;

public class MissingNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n - 1];

		for (int i = 0; i < n - 1; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(checkMissingNumber1(arr, n));
		System.out.println(checkMissingNumber2(arr, n));
	}

	private static int checkMissingNumber2(int[] arr, int n) {
		int total_sum = n * (n + 1) / 2;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return total_sum - sum;
	}

	private static int checkMissingNumber1(int[] arr, int n) {
		
		for (int i = 1; i <= n; i++) {
			boolean flag = false;
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i)
					flag = true;
			}
			
			if (!flag)
				return i;
		}
		
		return -1;
	}
}
