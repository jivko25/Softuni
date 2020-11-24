package Softuni.Fundamentals.TextProcessing;

import java.util.Scanner;

public class CaesarCilfer {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for(int i = 0;i<input.length();i++) {
			int ch = input.charAt(i) + 3;
			char newCh = (char) ch;
			System.out.print(newCh);
		}
	}
}
