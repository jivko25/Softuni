package Softuni.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		char char1 = 'a';
		char char2 = 'a';
		char char3 = 'a';
		for(int i = 0;i<n;i++) {
			char charr1 = (char)(i+97);
			char charr2 = (char)(97);
			char charr3 = (char)(97);
//			char1 = (char)(char1 + i);
//			char3 = 'a';
//			char2 = 'a';
			for(int k = 0;k<n;k++) {
				charr2 = (char)(k+97);
				charr3 = (char)(97);
//				char2 = (char) (char2 + k);
//				char3 = 'a';
				for(int m = 0;m<n;m++) {
					charr3 = (char)(m+97);
//					char3 = (char) (char3 + m);
					System.out.printf("%s%s%s\n", charr1, charr2, charr3);
				}
			}
		}
	}
}
