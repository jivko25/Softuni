package Softuni.Conditionals;

import java.util.Scanner;

public class GodzilaVsKong {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double budjet;
		int employees;
		double clothes;
		do {
			budjet = sc.nextDouble();
		}
		while(budjet<1 || budjet>1000000);
		do {
			employees = sc.nextInt();
		}
		while(employees<1 || employees>500);
		do {
			clothes = sc.nextDouble();
		}
		while(clothes<1 || clothes>1000);
		double clothesprice;
		if(employees >= 150) {
			clothes = clothes*0.9;
		}
		clothesprice = clothes * employees;
		double endSum = budjet - (budjet*0.1) - clothesprice;
		if(endSum < 0) {
			System.out.println("Not enough money!");
			System.out.print("Wingard needs ");
			System.out.format("%.2f", endSum * -1);
			System.out.print(" leva more.");
		}
		else {
			System.out.println("Action!");
			System.out.print("Wingard starts filming with ");
			System.out.format("%.2f", endSum);
			System.out.print(" leva left.");
		}
	}

}
