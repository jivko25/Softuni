package Softuni.Fundamentals.TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] input = sc.nextLine().split(" ");
		System.out.println(Multiplier(input[0], input[1]));
	}
	
	static int Multiplier(String input1, String input2) {
		int res = 0;
		for(int i = 0;i<Math.max(input1.length(), input2.length());i++) {
			if(Math.min(input1.length(), input2.length()) > i) {
				int ch1 = input1.charAt(i);
				int ch2 = input2.charAt(i);
				res = res + ch1 * ch2;
			}
			else {
				if(input1.length()>input2.length()) {
					int ch = input1.charAt(i);
					res+=ch;
				}
				else if(input1.length()<input2.length()) {
					int ch = input2.charAt(i);
					res+=ch;
				}
			}
		}
		return res;
	}
}
