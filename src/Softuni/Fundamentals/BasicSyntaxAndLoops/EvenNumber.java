package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		while(done==false) {
			int number = Integer.parseInt(sc.nextLine());
			if(number%2==0) {
				System.out.printf("The number is: %d", Math.abs(number));
				break;
			}
			else {
				System.out.println("Please write an even number.");
			}
		}
	}
}
