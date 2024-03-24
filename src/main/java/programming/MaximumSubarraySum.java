package programming;

import java.util.Scanner;

public class MaximumSubarraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		sc.close();
		System.out.println(getMax(arr, n));
	}

	private static int getMax(int[] arr, int n) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			
			if (max < sum)
				max = sum;
			if (sum < 0)
				sum = 0;
		}
		
		return max;
	}
}
