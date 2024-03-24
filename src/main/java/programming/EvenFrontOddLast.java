package programming;

import java.util.Arrays;
import java.util.Scanner;

public class EvenFrontOddLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		System.out.println(Arrays.toString(changeEvenOddPositions(arr)));
	}

	private static int[] changeEvenOddPositions(int[] arr) {
		int[] res = new int[arr.length];
		
		int m = arr.length - 1;
		int n = arr.length - 1;
		int j = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				res[j] = arr[i];
				j++;
			}
			
			if (arr[n] % 2 == 1) {
				res[m] = arr[n];
				m--;
			}
			n--;
		}
		
		return res;
	}
}
