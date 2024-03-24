package programming;

import java.util.Scanner;

public class CalculateNote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] notes = new int[] {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		System.out.print("Enter the amount: ");
		int amt = sc.nextInt();
		
		System.out.println("Total notes Required: " + calculateNote(notes, amt));
		sc.close();
	}

	private static int calculateNote(int[] notes, int amt) {
		int count = 0;
		
		for (int i = 0; i < notes.length; i++) {
			int currNote = notes[i];
			
			if (amt >= currNote) {
				System.out.println(currNote + " X " + (amt / currNote));
				count += (amt / currNote);
				amt = amt % currNote;
			}
		}
		
		return count;
	}
}
