package programming;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifications {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		copyArray(arr);
		copyArrayInReverse(arr);
		reversArray(arr);

		System.out.println("---------Merge array started---------");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];

		for (int i = 0; i < n1; i++)
			arr1[i] = sc.nextInt();
		
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];

		for (int i = 0; i < n2; i++)
			arr2[i] = sc.nextInt();
		
		sc.close();

		mergeTwoArrays(arr1, arr2);
	}

	private static void reversArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeTwoArrays(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		
		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		
		System.out.println(Arrays.toString(result));
	}

	private static void copyArrayInReverse(int[] arr) {
		
		int[] res = new int[arr.length];
		
		for (int i = arr.length - 1; i >= 0; i--) {
			res[arr.length - 1 - i] = arr[i];
		}
		
		System.out.println(Arrays.toString(res));
	}

	private static void copyArray(int[] arr) {
		int[] nums = arr.clone();
		System.out.println(Arrays.toString(nums));
	}
}
