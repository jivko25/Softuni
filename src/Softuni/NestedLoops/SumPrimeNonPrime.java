package Softuni.NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isDone = false;
		int prime = 0;
		int nonPrime = 0;
		while(isDone == false) {
			String input = sc.nextLine();
			if("stop".equals(input)) {
				isDone = true;
				break;
			} else {
				int number = Integer.parseInt(input);
				if(number<0) {
					System.out.println("Number is negative.");
					continue;
				}
				for(int i = 2;i<number;i++) {
					if(number%i == 0) {
						prime = prime + number;
						break;
					} 
					else if(i==(number-1) && number%i != 0) {
						nonPrime = nonPrime + number;
					}
				}
			}
		}
		System.out.printf("Sum of all prime numbers is: %d\n", nonPrime);
		System.out.printf("Sum of all non prime numbers is: %d", prime);
	}
}
