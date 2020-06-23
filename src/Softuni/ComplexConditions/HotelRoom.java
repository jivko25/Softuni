package Softuni.ComplexConditions;

import java.util.Scanner;

public class HotelRoom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days;
		String month = sc.nextLine();
		do {
			days = sc.nextInt();
		}
		while(days<0 || days>200);
		double apartment = 0;
		double studio = 0;
		double res;
		switch (month) {
		case "May":
			apartment = 65;
			studio = 50;
			if(days>7 && days<=14) {
				studio = studio*0.95;
			}
			else if(days>14) {
				studio = studio*0.7;
				apartment = apartment*0.9;
			}
			break;
		case "June":
			apartment = 68.7;
			studio = 75.2;
			if(days>14) {
				studio = studio*0.8;
				apartment = apartment*0.9;
			}
			break;
		case "July":
			apartment = 77;
			studio = 76;
			if(days>14) {
				apartment = apartment*0.9;
			}
			break;
		case "August":
			apartment = 77;
			studio = 76;
			if(days>14) {
				apartment = apartment*0.9;
			}
			break;
		case "September":
			apartment = 68.7;
			studio = 75.2;
			if(days>14) {
				studio = studio*0.8;
				apartment = apartment*0.9;
			}
			break;
		case "October":
			apartment = 65;
			studio = 50;
			if(days>7 && days<=14) {
				studio = studio*0.95;
			}
			else if(days>14) {
				studio = studio*0.7;
				apartment = apartment*0.9;
			}
			break;
		default:
			break;
		}
		System.out.printf("Apartment: %.2f lv. \n", apartment*days);
		System.out.printf("Studio: %.2f lv.", studio*days);
	}
}
