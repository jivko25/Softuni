package Softuni.ForLoops;

import java.util.Scanner;

public class DevideWithoutReminder {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double firstClass = 0;
		double secondClass = 0;
		double thirdClass = 0;
		for(int i = 1;i<=n;i++) {
			int number;
			do {
				number = sc.nextInt();
			}
			while(number<0 && number>1000);
			if(number%2 == 0) {
				firstClass++;
			}
			if(number%3 == 0) {
				secondClass++;
			}
			if(number%4 == 0) {
				thirdClass++;
			}
		}
		System.out.printf("%.2f", (firstClass/n)*100);
		System.out.println("%");
		System.out.printf("%.2f", (secondClass/n)*100);
		System.out.println("%");
		System.out.printf("%.2f", (thirdClass/n)*100);
		System.out.println("%");
	}
}
