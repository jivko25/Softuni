package Softuni.WhileLoops;

import java.util.Scanner;

public class Vacantion {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double moneyNeeds = Double.parseDouble(sc.nextLine());
		double moneyHave = Double.parseDouble(sc.nextLine());
		int negativeDays = 0;
		int days = 0;
		boolean colectedMoney = false;
		while(colectedMoney== false) {
			String action = sc.nextLine();
			double moneyAction = Double.parseDouble(sc.nextLine());
			if("spend".equals(action)) {
				moneyHave = moneyHave - moneyAction;
				negativeDays++;
				days++;
				if(negativeDays==5) {
					break;
				}
				if(moneyHave<0) {
					moneyHave=0;
				}
			}
			if("save".equals(action)) {
				moneyHave = moneyHave + moneyAction;
				days++;
				negativeDays = 0;
				if(moneyHave>=moneyNeeds) {
					colectedMoney = true;
					break;
				}
			}
		}
		if(colectedMoney == false) {
			System.out.printf("You can't save the money.\n%d", days);
		} else {
			System.out.printf("You saved the money for %d days.", days);
		}
	}
}
