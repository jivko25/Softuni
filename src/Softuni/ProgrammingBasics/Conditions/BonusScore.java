package Softuni.ProgrammingBasics.Conditions;

import java.util.Scanner;

public class BonusScore {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int points = sc.nextInt();
		double endpoints = points;
		int bonus = 0;
		if(points<100) {
			bonus = 5;
			if(points % 2 == 0) {
				bonus = bonus + 1;
			}
			if(points % 10 == 5) {
				bonus = bonus + 2;
			}
			endpoints = points + bonus;
		}
		else if(points>100 && points<1000) {
			endpoints = endpoints*1.2;
			if(points % 2 == 0) {
				endpoints = endpoints + 1;
			}
			if(points % 10 == 5) {
				endpoints = endpoints + 2;
			}
		}
		else {
			endpoints = endpoints*1.1;
			if(points % 2 == 0) {
				endpoints = endpoints + 1;
			}
			if(points % 10 == 5) {
				endpoints = endpoints + 2;
			}
		}
		System.out.format("%.1f",endpoints - points);
		System.out.println("");
		System.out.println(endpoints);
	}
}
