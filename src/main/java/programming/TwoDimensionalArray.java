package programming;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] matrix = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		

		for (int[] arr : matrix)
			System.out.println(Arrays.toString(arr));
		
		System.out.println(sumOfElements(matrix));
		printEvenElemets(matrix);
		printSumOfEachRow(matrix);
		sumOfLeftDiagonal(matrix);
		sumOfRightDiagonal(matrix);
		sumOfEvenPositionElements(matrix);
		
		
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		int[][] arr = {{1,2},{1,2,3},{7}};
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	private static void sumOfEvenPositionElements(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) 
			for (int j = 0; j < matrix[0].length; j++)
				if (i % 2 == 0 && j % 2 == 0)
					sum += matrix[i][j];
		
		System.out.println(sum);
	}

	private static int sumOfElements(int[][] matrix) {
		int sum = 0;
		
		for (int i = 0; i < matrix.length; i++) 
			for (int j = 0; j < matrix[0].length; j++)
				sum += matrix[i][j];
			
		return sum;
	}

	private static void printEvenElemets(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) 
			for (int j = 0; j < matrix[0].length; j++)
				if (matrix[i][j] % 2 == 0)
					System.out.print(matrix[i][j] + " ");
		System.out.println();
	}

	private static void printSumOfEachRow(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[0].length; j++)
				sum += matrix[i][j];
			System.out.print(sum + " ");
		}
		
		System.out.println();
	}

	private static void sumOfLeftDiagonal(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				if (i == j)
					sum += matrix[i][j];
		
		System.out.println(sum);
	}

	private static void sumOfRightDiagonal(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				if (i + j + 1 == matrix.length)
					sum += matrix[i][j];
		
		System.out.println(sum);
	}
}
