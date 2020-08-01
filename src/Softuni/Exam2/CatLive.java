package Softuni.Exam2;

import java.util.Scanner;

public class CatLive {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		String sex = sc.nextLine();
		double catLives = 0;
		switch (type) {
		case "British Shorthair":
			if("m".equals(sex)) {
				catLives = 13;
			}
			else if("f".equals(sex)) {
				catLives = 14;
			}
			System.out.printf("%.0f cat months", (catLives*12)/6);
			break;
			
		case "Siamese":
			if("m".equals(sex)) {
				catLives = 15;
			}
			else if("f".equals(sex)) {
				catLives = 16;
			}
			System.out.printf("%.0f cat months", (catLives*12)/6);
			break;
		
		case "Persian":
			if("m".equals(sex)) {
				catLives = 14;
			}
			else if("f".equals(sex)) {
				catLives = 15;
			}
			System.out.printf("%.0f cat months", (catLives*12)/6);
			break;
			
		case "Ragdoll":
			if("m".equals(sex)) {
				catLives = 16;
			}
			else if("f".equals(sex)) {
				catLives = 17;
			}
			System.out.printf("%.0f cat months", (catLives*12)/6);
			break;
			
		case "American Shorthair":
			if("m".equals(sex)) {
				catLives = 12;
			}
			else if("f".equals(sex)) {
				catLives = 13;
			}
			System.out.printf("%.0f cat months", (catLives*12)/6);
			break;
			
		case "Siberian":
			if("m".equals(sex)) {
				catLives = 11;
			}
			else if("f".equals(sex)) {
				catLives = 12;
			}
			System.out.printf("%.0f cat months", (catLives*12)/6);
			break;	

		default:
			System.out.printf("%s is invalid cat!", type);
			break;
		}
	}
}
