package Softuni.ComplexConditions;

import java.util.Scanner;

public class Cinema {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String projection = sc.nextLine();
		int rows = Integer.parseInt(sc.nextLine());
		int columns = Integer.parseInt(sc.nextLine());
		double income = 0.0;
		if("Premiere".equals(projection)) {
			income = rows * columns * 12;
		}
		else if("Normal".equals(projection)) {
			income = rows * columns * 7.5;
		}
		else if("Discount".equals(projection)) {
			income = rows * columns * 5;
		}
		System.out.printf("%.2f", income);
		System.out.println("");
		System.out.println("leva");
	}

}
