package programming;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkArmstrong(n));
		sc.close();
	}

	private static boolean checkArmstrong(int n) {
		int len = String.valueOf(n).length();
		int sum = 0;
		int num = n;
		
		while (n > 0) {
			
			
			sum += Math.pow(n % 10, len);
			n /= 10;
		}
		
		return sum == num;
	}
}
