package Softuni.ComplexConditions;

import java.util.Scanner;

public class NewHome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String typeFlowers = sc.nextLine();
		int flowers;
		int budget;
		do {
			flowers = sc.nextInt();
		}
		while(flowers<10 || flowers>1000);
		double sum = 0;
		do {
			budget = sc.nextInt();
		}
		while(budget < 50 || budget>2500);
		switch (typeFlowers) {
		case "Roses":
			if(flowers>80) {
				sum = flowers*5*0.9;
			}
			else {
				sum = flowers*5;
			}
			break;
		case "Dahlias":
			if(flowers>90) {
				sum = flowers*3.8*0.85;
			}
			else {
				sum = flowers*3.8;
			}
			break;
		case "Tulips":
			if(flowers>80) {
				sum = flowers*2.8*0.85;
			}
			else {
				sum = flowers*2.8;
			}
			break;	
		case "Narcissus":
			if(flowers<120) {
				sum = flowers*3*0.85;
			}
			else {
				sum = flowers*3;
			}
			break;	
		case "Gladiolus":
			if(flowers<80) {
				sum = flowers*2.5*0.8;
			}
			else {
				sum = flowers*2.5;
			}
			break;	

		default:
			System.out.println("Mistake!");
			break;
		}
		if(budget>sum) {
			System.out.print("Hey, you have a great garden with " + flowers + " " + typeFlowers + " and ");
			System.out.format("%.2f", budget - sum);
			System.out.print(" leva left.");
//			System.out.printf("Hey, you have a great garden with %d %s and %f leva left.", flowers, typeFlowers, budget-sum);
		}
		else {
			System.out.print("Not enough money, you need ");
			System.out.format("%.2f", sum-budget);
			System.out.print(" leva more.");
//			System.out.printf("Not enough money, you need %f leva more.", sum - budget);
		}
	}

}
