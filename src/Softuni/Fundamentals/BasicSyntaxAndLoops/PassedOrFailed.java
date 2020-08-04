package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class PassedOrFailed {
	public static void main(String [] args) {
		Scanner sc =  new Scanner(System.in);
		double grade = Double.parseDouble(sc.nextLine());
		if(grade>=3) {
			System.out.print("Passed!");
		}
		else if(grade<3) {
			System.out.print("Failed!");
		}
	}
}

