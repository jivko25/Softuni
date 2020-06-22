package Softuni.ComplexConditions;

import java.util.Scanner;

public class SummerOutfit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int degrees;
		String clothes;
		do {
		   degrees = Integer.parseInt(sc.nextLine());
		}
		while(degrees<10 || degrees>42);
		String time = sc.next();
		if(degrees>=10 && degrees<=18) {
			if("Morning".equals(time)) {
				clothes = "Sweatshirt and Sneakers.";
				System.out.println("It's " + degrees + " degrees, get your " + clothes );
			}
			else if("Afternoon".equals(time)) {
				clothes = "Shirt and Moccasins.";
				System.out.println("It's " + degrees + " degrees, get your " + clothes );
			}
			else if("Evening".equals(time)) {
				clothes = "Shirt and Moccasins.";
				System.out.println("It's " + degrees + " degrees, get your " + clothes );
			}
		}
		else if(degrees>18 && degrees<=24) {
			if("Morning".equals(time)) {
				clothes = "Shirt and Moccasins.";
				System.out.println("It's " + degrees + " degrees, get your " + clothes );
			}
			else if("Afternoon".equals(time)) {
				clothes = "T-Shirt and Sandals.";
				System.out.println("It's " + degrees + " degrees, get your " + clothes );
			}
			else if("Evening".equals(time)) {
				clothes = "Shirt and Moccasins.";
				System.out.println("It's " + degrees + " degrees, get your " + clothes );
			}
		}
		else if(degrees>=25) {
			if("Morning".equals(time)) {
				clothes = "T-Shirt and Sandals.";
				System.out.println("It's " + degrees + " degrees, get your " + clothes );
			}
			else if("Afternoon".equals(time)) {
				clothes = "Swim Suit and Barefoot.";
				System.out.println("It's " + degrees + " degrees, get your " + clothes );
			}
			else if("Evening".equals(time)) {
				clothes = "Shirt and Moccasins.";
				System.out.println("It's " + degrees + " degrees, get your " + clothes );
			}
			System.out.println("..");
		}
	}
}
