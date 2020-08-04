package Softuni.ProgrammingBasics.ForLoops;

import java.util.Scanner;

public class Histogram {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double firstClass = 0;
		double secondClass = 0;
		double thirdClass = 0;
		double fourthClass = 0;
		double fifthClass = 0;
		for(int i = 1;i<=n;i++) {
			int number;
			do {
				 number = sc.nextInt();
			}
			while(number<0 || number>1000);
			if(number<200) {
				firstClass++;
			}
			else if(number>=200 && number<=399) {
				secondClass++;
			}
			else if(number>=400 && number<=599) {
				thirdClass++;
			}
			else if(number>=600 && number<=799) {
				fourthClass++;
			}
			else {
				fifthClass++;
			}
		}
		System.out.printf("%.2f", (firstClass/n)*100);
		System.out.println("%");
		System.out.printf("%.2f", (secondClass/n)*100);
		System.out.println("%");
		System.out.printf("%.2f", (thirdClass/n)*100);
		System.out.println("%");
		System.out.printf("%.2f", (fourthClass/n)*100);
		System.out.println("%");
		System.out.printf("%.2f", (fifthClass/n)*100);
		System.out.println("%");
	}

}
