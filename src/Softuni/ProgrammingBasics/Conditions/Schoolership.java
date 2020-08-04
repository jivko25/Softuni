package Softuni.ProgrammingBasics.Conditions;

import java.util.Scanner;

public class Schoolership {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double incom;
		double average;
		double minSelary;
		do {
			incom = sc.nextDouble();
		}
		while(incom<0 || incom>6000);
		
		do {
			average = sc.nextDouble();
		}
		while(average<2 || average>6);
		
		do {
			minSelary = sc.nextDouble();
		}
		while(minSelary<0 || minSelary>1000);
		
		if(average < 4.5 || (incom>minSelary && average<5.5)) {
			System.out.println("You cannot get a scholarship!");
		}
		else if(average>4.5 && incom>minSelary) {
			System.out.println("You get a Social scholarship " + Math.floor(minSelary*0.35) + " BGN");
		}
		else if(average>5.5 && minSelary<incom && (minSelary*0.35 < average*25)) {
			System.out.println("You get a scholarship for excellent result" + Math.floor(average*25) + " BGN");
		}
		else {
			System.out.println("You get a Social scholarship " + Math.floor(minSelary*0.35) + " BGN");
		}
	}

}
