package Softuni.Exam;

import java.util.Scanner;

public class AddBags {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double overPrice = sc.nextDouble();
		double kilograms = sc.nextDouble();
		int days = sc.nextInt();
		int bags = sc.nextInt();
		double bagPrice = 0;
		if(kilograms<10 && kilograms>0) {
			bagPrice=overPrice*0.2;
			if(days>30) {
				bagPrice = bagPrice*1.1;
			}
			else if(days>=7 && days <=30) {
				bagPrice = bagPrice*1.15;
			}
			else if(days < 7) {
				bagPrice = bagPrice*1.4;
			}
		}
		else if(kilograms>=10 && kilograms<=20) {
			bagPrice=overPrice*0.5;
			if(days>30) {
				bagPrice = bagPrice*1.1;
			}
			else if(days>=7 && days <=30) {
				bagPrice = bagPrice*1.15;
			}
			else if(days < 7) {
				bagPrice = bagPrice*1.4;
			}
		}
		else if(kilograms>20) {
			bagPrice=overPrice;
			if(days>30) {
				bagPrice = bagPrice*1.1;
			}
			else if(days>=7 && days <=30) {
				bagPrice = bagPrice*1.15;
			}
			else if(days < 7) {
				bagPrice = bagPrice*1.4;
			}
		}
		System.out.format("The total price of bags is: %.2f lv.", bagPrice*bags);
	}

}
