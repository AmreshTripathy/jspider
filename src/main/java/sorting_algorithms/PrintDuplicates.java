package sorting_algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		print(arr, n);
	}

	private static void print(int[] arr, int n) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(map.get(num), 0) + 1);
		}
		
		System.out.println();

		for (int num : map.keySet()) {
			if (map.get(num) > 1)
				System.out.print(num + " ");
		}
		
		System.out.println();

		for (int num : map.keySet()) {
			if (map.get(num) == 1)
				System.out.print(num + " ");
		}
		
		System.out.println();

		for (int num : map.keySet()) {
			if (map.get(num) > 1)
				System.out.print(num + " ");
		}
		
		System.out.println();

		for (int num : map.keySet()) {
			System.out.println(num + " --> " + map.get(num));
		}
	}
}
