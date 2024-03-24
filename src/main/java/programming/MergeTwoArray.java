package programming;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] a = new int[n1];

		for (int i = 0; i < n1; i++)
			a[i] = sc.nextInt();

		int n2 = sc.nextInt();
		int[] b = new int[n2];

		for (int i = 0; i < n2; i++)
			b[i] = sc.nextInt();

		sc.close();
		System.out.println(Arrays.toString(mergeTwoArray1(a, b)));
		System.out.println(Arrays.toString(mergeTwoArray2(a, b)));
		System.out.println(Arrays.toString(mergeTwoArray3(a, b)));
	}

	private static int[] mergeTwoArray1(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];

		System.arraycopy(a, 0, res, 0, a.length);
		System.arraycopy(b, 0, res, a.length, b.length);

		return res;
	}

	private static int[] mergeTwoArray2(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			res[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			res[a.length + i] = b[i];
		}

		return res;
	}

	private static int[] mergeTwoArray3(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];

		int k = 0;

		for (int i = 0; i < res.length; i++) {
			if (i < a.length) {
				res[i] = a[k++];
			} else {
				res[i] = b[k - a.length];
				k++;
			}
		}

		return res;
	}
}
