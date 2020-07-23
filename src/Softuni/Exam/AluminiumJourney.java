package Softuni.Exam;

import java.util.Scanner;

public class AluminiumJourney {
	public static void main(String [] args) {
		Scanner  sc = new Scanner(System.in);
		int number = sc.nextInt();
		String type = sc.next();
		String delivery = sc.next();
		int price;
		double sum = 0;
		if(number<10) {
			System.out.println("Invalid order");
		}
		else {
		switch (type) {
		case "90X130":
			price = 110;
			sum = number*price;
			if(number>30 && number<=60) {
				sum = sum*0.95;
			}
			else if(number>60) {
				sum = sum*0.92;
			}
			if(delivery.length() == 4) {
				sum = sum + 60;
			}
			if(number>99) {
				sum = sum*0.96;
			}
			break;
		case "100X150":
			price = 140;
			sum = number*price;
			if(number>40 && number<=80) {
				sum = sum*0.94;
			}
			else if(number>80) {
				sum = sum*0.90;
			}
			if(delivery.length() == 4) {
				sum = sum + 60;
			}
			if(number>99) {
				sum = sum*0.96;
			}
			break;	
		case "130X180":
			price = 190;
			sum = number*price;
			if(number>20 && number<=50) {
				sum = sum*0.93;
			}
			else if(number>50) {
				sum = sum*0.88;
			}
			if(delivery.length() == 4) {
				sum = sum + 60;
			}
			if(number>99) {
				sum = sum*0.96;
			}
			break;	
		case "200X300":
			price = 250;
			sum = number*price;
			if(number>25 && number <=50) {
				sum = sum*0.91;
			}
			else if(number>50) {
				sum = sum*0.86;
			}
			if(delivery.length() == 4) {
				sum = sum + 60;
			}
			if(number>99) {
				sum = sum*0.96;
			}
			break;	
		default:
			break;
		}
		System.out.format("%.2f BGN", sum);
		}
		
	}
}
