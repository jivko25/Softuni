package Softuni.ComplexConditions;

import java.util.Scanner;

public class OperationsBetweenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		do {
			firstNumber= sc.nextInt();
		}
		while(firstNumber<0 || firstNumber>40000);
		do {
			secondNumber= sc.nextInt();
		}
		while(secondNumber<0 || secondNumber>40000);
		String action = sc.next();
		String isEven;
		switch (action) {
		case "+":
				if((firstNumber+secondNumber)%2==0) {
					isEven = "even";
				}
				else {
					isEven = "odd";
				}
				System.out.printf("%d + %d = %d - %s", firstNumber, secondNumber, firstNumber + secondNumber, isEven);
			break;
		case "-":
			if((firstNumber-secondNumber)%2==0) {
				isEven = "even";
			}
			else {
				isEven = "odd";
			}
			System.out.printf("%d - %d = %d - %s", firstNumber, secondNumber, firstNumber - secondNumber, isEven);
			break;
		case "*":
				if((firstNumber*secondNumber)%2==0) {
					isEven = "even";
				}
				else {
					isEven = "odd";
				}
				System.out.printf("%d * %d = %d - %s", firstNumber, secondNumber, firstNumber * secondNumber, isEven);
			break;
		case "/":
			if(secondNumber==0) {
				System.out.printf("Cannot divide %d by zero", firstNumber);
			}
			else {
				double res = firstNumber/secondNumber;
				if((firstNumber/secondNumber)%2==0) {
					isEven = "even";
				}
				else {
					isEven = "odd";
				}
				System.out.printf("%d / %d = %f - %s", firstNumber, secondNumber, res, isEven);
			}

			break;
		case "%":
			if(secondNumber==0) {
				System.out.printf("Cannot divide %d by zero", firstNumber);
			}
			else {
			if((firstNumber%secondNumber)%2==0) {
				isEven = "even";
			}
			else {
				isEven = "odd";
			}
			System.out.printf("%d % %d = %d - %s", firstNumber, secondNumber, firstNumber % secondNumber, isEven);
			}
			break;
		default:
			break;
		}
	}
}
