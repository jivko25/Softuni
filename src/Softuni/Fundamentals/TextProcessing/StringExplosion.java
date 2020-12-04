package Softuni.Fundamentals.TextProcessing;

import java.util.Scanner;

public class StringExplosion {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		int tt = sb.charAt(0) -48;
		for(int i = 0;i<sb.length();i++) {
			if(sb.charAt(i) == '>') {
				int detonation = sb.charAt(i+1) - 48;
				for(int k = 0;k<detonation;k++) {
					if((i+k) >= sb.length()-1) {
						break;
					}
					else if(Character.isDigit(sb.charAt(i+k))) {
						int bonus = sb.charAt(i+k) - 48;
						sb.deleteCharAt(i+k);
						detonation += bonus;
					}
					else if(sb.charAt(i+k) == '>') {
						k-=1;
						continue;
					}
					else {
						sb.deleteCharAt(i+k);
					}
				}
			}
		}
		System.out.println(sb);
	}
}
