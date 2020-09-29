package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class GameStore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = Double.parseDouble(sc.nextLine());
		String game = null;
		double total = 0;
		while(game != "Game Time") {
			game = sc.nextLine();
			if("Game Time".equals(game)) {
				break;
			}
			switch (game) {
			case "OutFall 4":
				if(balance - 39.99 >0) {
					System.out.println("Bought OutFall 4");
					balance -= 39.99;
					total += 39.99;
				}
				else if(balance - 39.99 == 0) {
					System.out.println("Bought OutFall 4");
					System.out.println("Out of money!");
					break;
				}
				else {
					System.out.println("Too Expensive");
				}
				break;
			case "CS: OG":
				if(balance - 15.99 >0) {
					System.out.println("Bought CS: OG");
					balance -= 15.99;
					total += 15.99;
				}
				else if(balance - 15.99 == 0) {
					System.out.println("Bought CS: OG");
					System.out.println("Out of money!");
					break;
				}
				else {
					System.out.println("Too Expensive");
				}
				break;
			case "Zplinter Zell":
				if(balance - 19.99 >0) {
					System.out.println("Bought Zplinter Zell");
					balance -= 19.99;
					total += 19.99;
				}
				else if(balance - 19.99 == 0) {
					System.out.println("Bought Zplinter Zell");
					System.out.println("Out of money!");
					break;
				}
				else {
					System.out.println("Too Expensive");
				}
				break;
			case "Honored 2":
				if(balance - 59.99 >0) {
					System.out.println("Bought Honored 2");
					balance -= 59.99;
					total += 59.99;
				}
				else if(balance - 59.99 == 0) {
					System.out.println("Bought Honored 2");
					System.out.println("Out of money!");
					break;
				}
				else {
					System.out.println("Too Expensive");
				}
				break;
			case "RoverWatch":
				if(balance - 29.99 >0) {
					System.out.println("Bought RoverWatch");
					balance -= 29.99;
					total += 29.99;
				}
				else if(balance - 29.99 == 0) {
					System.out.println("Bought RoverWatch");
					System.out.println("Out of money!");
					break;
				}
				else {
					System.out.println("Too Expensive");
				}
				break;
			case "RoverWatch Origins Edition":
				if(balance - 39.99 >0) {
					System.out.println("Bought RoverWatch Origins Edition");
					balance -= 39.99;
					total += 39.99;
				}
				else if(balance - 39.99 == 0) {
					System.out.println("Bought RoverWatch Origins Edition");
					System.out.println("Out of money!");
					break;
				}
				else {
					System.out.println("Too Expensive");
				}
				break;

			default:
				System.out.println("Not Found");
				break;
			}
		}
		if(balance>0) {
			System.out.printf("Total spent: $%.2f. Remaining: $%.2f", total, balance);
		}
	}
	
}
