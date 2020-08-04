package Softuni.ProgrammingBasics.Exam2;

import java.util.Scanner;

public class ExcursionSale {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int sea = Integer.parseInt(sc.nextLine());
		int mountain = Integer.parseInt(sc.nextLine());
		int seaSold = 0;
		int mountainSold = 0;
		boolean isFinished = false;
		while(isFinished == false) {
			String pack = sc.nextLine();
			if("sea".equals(pack)) {
				if(sea <= 0) {
					continue;
				}
				else {
				sea--;
				seaSold++;
				}
				
				if(mountain == 0 && sea == 0) {
					isFinished = true;
					break;
				}
			}
			else if("mountain".equals(pack)) {
				if(mountain <= 0) {
					continue;
				}
				else {
				mountain--;
				mountainSold++;
				}
				
				if(mountain == 0 && sea == 0) {
					isFinished = true;
					break;
				}
			}
			else if("Stop".equals(pack)) {
				break;
			}
		}
		if(isFinished) {
			System.out.printf("Good job! Everything is sold.\nProfit: %d leva.", seaSold*680 + mountainSold*499);
		}
		else {
			System.out.printf("Profit: %d leva.", (seaSold * 680) + (mountainSold * 499));
		}
	}
}
