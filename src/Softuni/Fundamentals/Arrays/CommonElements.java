package Softuni.Fundamentals.Arrays;

import java.util.Scanner;

public class CommonElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstSentense = sc.nextLine();
		String secondSentense = sc.nextLine();
		String[] first = firstSentense.split("\\W+");
		String[] second = secondSentense.split("\\W+");
//		for(int i = 0;i<=first.length;i++) {
//			for(int k = 0;k<second.length;k++) {
//			if(second[k].equals(first[i])) {
////				System.out.println(i + "-" + k + first[i] + "-" + second[k]);
//				System.out.print(second[k] + " ");
//			}
//			}
//		}
		for(int i = 0;i<=second.length;i++) {
			for(int k = 0;k<first.length;k++) {
			if(second[i].equals(first[k])) {
//				System.out.println(i + "-" + k + first[i] + "-" + second[k]);
				System.out.print(second[i] + " ");
			}
			}
		}
	}
}
