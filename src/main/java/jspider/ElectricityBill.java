package jspider;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unit = sc.nextInt();
		sc.close();
		System.out.printf("%.2f", calculateElectricityBill(unit));
	}

	private static double calculateElectricityBill(int unit) {
		double amount = 0;
		
		if (unit < 200) {
			amount = unit * 1.2;
		} else if (unit < 400) {
			amount = (unit - 199) * 1.5 + 199 * 1.2;
		} else if (unit < 600) {
			amount = (unit - 399) * 1.8 + 200 * 1.5 + 199 * 1.2;
		} else {
			amount = (unit - 599) * 2 + 200 * 1.8 + 200 * 1.5 + 199 * 1.2;
		}
		
		if (unit > 400) {
			amount += amount * 0.15; 
		}
		
		return (amount < 100) ? 100 : amount;
	}

}
