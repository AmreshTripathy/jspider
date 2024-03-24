package programming;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		sc.close();
		System.out.println(checkIndexOfGivenNumber(arr, k));
	}

	private static int checkIndexOfGivenNumber(int[] arr, int k) {
		int lo = 0, hi = arr.length - 1;
		
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			
			if (arr[mid] == k)
				return mid;
			else if (k < arr[mid])
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		
		return -1;
	}
}
// TC: O(log(N))
// SC: O(1)