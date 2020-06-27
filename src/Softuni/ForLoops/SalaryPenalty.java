package Softuni.ForLoops;

import java.util.Scanner;

public class SalaryPenalty {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int salary;
		do {
			n = sc.nextInt();
		}
		while(n<0 || n>10);
		do {
			salary = sc.nextInt();
		}
		while(salary<700 || salary>1500);
		for(int i = 0;i<=n;i++) {
			String website = sc.nextLine();
			if(website.equals("Facebook")) {
				salary = salary-150;
			}
			if(website.equals("Instagram")) {
				salary = salary-100;
			}
			if(website.equals("Reddit")) {
				salary = salary-50;
			}
			if(salary<=0) {
				System.out.println("You have lost your salary.");
				break;
			}
		}
		if (salary!=0){
			System.out.println(salary);
		}
	}

}
