package programming;

import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println("Lucky Number: " + checkLuckyNumber(n));
	}

	private static boolean checkLuckyNumber(int n) {
		
		int sum = sumOfN(n);
		
		if (String.valueOf(sum).length() == 1)
			return sum == 1;
		else
			return checkLuckyNumber(sum);
	}

	private static int sumOfN(int n) {
		int sum = 0;
		
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
}
