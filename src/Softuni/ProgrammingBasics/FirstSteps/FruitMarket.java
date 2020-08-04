package Softuni.ProgrammingBasics.FirstSteps;
import java.util.Scanner;

public class FruitMarket {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double strawberyPrice;
		double bananas;
		double oranges;
		double raspberys;
		double strawberys;
		do {
			strawberyPrice = sc.nextDouble();
		}
		while(strawberyPrice<0 && strawberyPrice>10000);
		
		do {
			bananas = sc.nextDouble();
		}
		while(bananas<0 && bananas>10000);
		
		do {
			oranges = sc.nextDouble();
		}
		while(oranges<0 && oranges>10000);
		
		do {
			raspberys = sc.nextDouble();
		}
		while(raspberys<0 && raspberys>10000);
		
		do {
			strawberys = sc.nextDouble();
		}
		while(strawberys<0 && strawberys>10000);
		
		double raspberysPrice = strawberyPrice*0.5;
		double orangePrice = raspberysPrice*0.6;
		double bananasPrice = raspberysPrice*0.2;
		double result = strawberys*strawberyPrice + bananas*bananasPrice + oranges*orangePrice + raspberys*raspberysPrice;
		System.out.format("%.2f", result);
	}

}
