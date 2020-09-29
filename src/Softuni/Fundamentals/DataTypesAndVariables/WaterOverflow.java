package Softuni.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			int liters = Integer.parseInt(sc.nextLine());
			if(sum+liters>255) {
				System.out.println("Insufficient capacity!");
			}
			else {
				sum = sum + liters;
			}
		}
		System.out.println(sum);
	}
}
