package test1;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(withoutDoubles(sc.nextInt(), sc.nextInt(), sc.nextBoolean()));

		sc.close();
	}

	private static int withoutDoubles(int a, int b, boolean noDoubles) {

		if (noDoubles) {
			if (a == b) {
				return (a == 6) ? 1 + b : a + b + 1;
			}
		}

		return a + b;
	}
}
