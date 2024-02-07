package test1;

import java.util.Scanner;

public class Teen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(noTeenSum(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		sc.close();
	}

	private static int noTeenSum(int a, int b, int c) {
		// TODO Auto-generated method stub
		return checkTeen(a) + checkTeen(b) + checkTeen(c);
	}

	private static int checkTeen(int n) {
		if (13 <= n && n <= 19)
			return (n == 15 || n == 16) ? n : 0;
		return n;
	}

}
