package Softuni.ProgrammingBasics.Exam2;

import java.util.Scanner;

public class CatShirt {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double sleave = Double.parseDouble(sc.nextLine());
		double front = Double.parseDouble(sc.nextLine());
		String cloth = sc.nextLine();
		String decition = sc.nextLine();
		double shirt = ((sleave*2 + front*2)*1.1)/100;
		double shirtPrice = 0;
		boolean mistake = false;
		switch (cloth) {
		case "Linen":
			shirtPrice = shirt * 15 + 10;
			if("Yes".equals(decition)) {
				shirtPrice = shirtPrice*1.2;
			}
			break;
		case "Cotton":	
			shirtPrice = shirt * 12 + 10;
			if("Yes".equals(decition)) {
				shirtPrice = shirtPrice*1.2;
			}
			break;
		case "Denim":
			shirtPrice = shirt * 20 + 10;
			if("Yes".equals(decition)) {
				shirtPrice = shirtPrice*1.2;
			}
			break;
		case "Twill":	
			shirtPrice = shirt * 16 + 10;
			if("Yes".equals(decition)) {
				shirtPrice = shirtPrice*1.2;
			}
			break;
		case "Flannel":
			shirtPrice = shirt * 11 + 10;
			if("Yes".equals(decition)) {
				shirtPrice = shirtPrice*1.2;
			}
			break;
		default:
			mistake = true;
			break;
		}
		if(mistake == true) {
			System.out.println(100/0);
		}
		System.out.printf("The price of the shirt is: %.2flv.", shirtPrice);
	}
}
