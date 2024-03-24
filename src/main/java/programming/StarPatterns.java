package programming;

import java.util.Scanner;

public class StarPatterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		printRigtAngledPattern(n);
		System.out.println("------------------------");
		printRigtAngledOppositePattern(n);
		System.out.println("------------------------");
		printRigtAngledRightSide(n);
		System.out.println("------------------------");
		printRigtAngledRightSideOpposite(n);
		System.out.println("------------------------");
		printPyramid(n);
		System.out.println("------------------------");
		printPyramidOpposite(n);
		System.out.println("------------------------");
		printLeftAndRightSideRightAngled(n);
		System.out.println("------------------------");
		printLeftAndRightSideRightAngledOpposite(n);
		System.out.println("------------------------");
		printLeftAndOppositeOfLeftAngled(n);
		System.out.println("------------------------");
		nStarTriangle(n);
	}

	private static void nStarTriangle(int n) {
		int x = n, y = n;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n * 2; j++) {
				if (j >= x && j <= y) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			x--;
			y++;
			System.out.println();
		}
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n - 1 - i; j++)
//				System.out.print(" ");
//			for (int j = 0; j < i; j++)
//				System.out.print("*");
//			for (int j = 0; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
	}

	private static void printLeftAndOppositeOfLeftAngled(int n) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1 ; i++) {
			for (int j = i; j < n - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void printLeftAndRightSideRightAngledOpposite(int n) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n - 1; j++) {
				System.out.print("* ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void printLeftAndRightSideRightAngled(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++)
				System.out.print("  ");
			for (int j = 0; j < i; j++)
				System.out.print("* ");
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}

	private static void printPyramidOpposite(int n) {
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j > i; j--)
				System.out.print(" ");
			for (int j = i; j >= 0; j--)
				System.out.print("* ");
			System.out.println();
		}
	}

	private static void printPyramid(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}

	private static void printRigtAngledRightSideOpposite(int n) {
//		for (int i = n - 1; i >= 0; i--) {
//			for (int j = n - 1; j > i; j--)
//				System.out.print("  ");
//			for (int j = i; j >= 0; j--)
//				System.out.print("* ");
//			System.out.println();
//		}
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void printRigtAngledRightSide(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++)
				System.out.print("  ");
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}

	private static void printRigtAngledPattern(int n) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void printRigtAngledOppositePattern(int n) {
		for (int i = 0; i < n ; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
