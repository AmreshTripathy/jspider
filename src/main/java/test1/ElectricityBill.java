package test1;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(calculateBill(sc.nextInt()));
		sc.close();
	}

	private static double calculateBill(int unit) {
		if (unit > 500)
			return (unit - 500) * 7 + 300 * 6 + 100 * 4.5 + 100 * 2;
		else if (unit > 200)
			return (unit - 200) * 6 + 100 * 4.5 + 100 * 2;
		else if (unit > 100)
			return (unit - 100) * 4.5 + 100 * 2;
		else
			return unit * 2;
	}

}
