package test1;

import java.util.Scanner;

public class CheckVowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(checkVowelOrConsonant(ch));
		sc.close();
	}

	private static String checkVowelOrConsonant(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return "Vowel";
		
		return ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') ? "Consonant" : "Invalid Entry";
	}

}
