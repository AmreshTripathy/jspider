package test1;

import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(isAlphabet(ch));
		sc.close();
	}

	private static boolean isAlphabet(char ch) {
		return ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z');
	}

}
