package programming;

import java.util.Scanner;

public class UniqueNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(checkUniqueNo(n));
	}

	private static boolean checkUniqueNo(int n) {
		int[] count = new int[10];
		
		while (n > 0) {
			int digit = n % 10;
			if (count[digit] == 1)
				return false;
			
			count[digit]++;
			n /= 10;
		}
		
		return true;
	}
}
