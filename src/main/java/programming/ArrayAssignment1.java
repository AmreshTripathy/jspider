package programming;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		sc.close();
		printArray(arr);
		printArrayReverseOrder(arr);
		printSumOfArrayElements(arr);
		printFirstHalf(arr);
		printSecondHalf(arr);
		sumOfEvenElements(arr);
		replaceAllEvenElementsWithZero(arr);
		printEvenIndexElements(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static void printArrayReverseOrder(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static void printSumOfArrayElements(int[] arr) {
		System.out.println(Arrays.stream(arr).sum());
	}

	private static void printFirstHalf(int[] arr) {
		for (int i = 0; i < (arr.length - 1) / 2; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static void printSecondHalf(int[] arr) {
		for (int i = (arr.length - 1) / 2; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static void sumOfEvenElements(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				sum += arr[i];
		}
		
		System.out.println(sum);
	}

	private static void replaceAllEvenElementsWithZero(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				arr[i] = 0;
		}
		
		printArray(arr);
	}

	private static void printEvenIndexElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				System.out.print(arr[i] + " ");
		}
	}

}
