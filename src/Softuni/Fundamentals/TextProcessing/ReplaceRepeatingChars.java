package Softuni.Fundamentals.TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char token = ' ';
		for(int i = 0;i<input.length();i++) {
			if(input.charAt(i) == token) {
				continue;
			}
			else {
				token = input.charAt(i);
				System.out.print(token);
			}
		}
	}
}
