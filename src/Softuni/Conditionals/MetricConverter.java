package Softuni.Conditionals;

import java.util.Scanner;

public class MetricConverter {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		String textIn = sc.next();
		String textOut = sc.next();
		if(textIn == "mm") {
			if(textOut == "cm") {
				System.out.print(number/10);
			}
			else if(textOut == "m") {
				System.out.print(number/1000);
			}
		}
		else if(textIn == "cm") {
			if(textOut == "mm") {
				System.out.print(number*10);
			}
			else if(textOut == "m") {
				System.out.print(number/100);
			}
		}
		else if(textIn == "m") {
			if(textOut == "mm") {
				System.out.print(number*1000);
			}
			if(textOut == "cm") {
				System.out.print(number*100);
			}
		}
	}

}
