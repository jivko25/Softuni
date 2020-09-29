package Softuni.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String maxName = "";
		double max = 0;
		for(int i = 1;i<=n;i++) {
			String name = sc.nextLine();
			double r = Double.parseDouble(sc.nextLine());
			double h = Double.parseDouble(sc.nextLine());
			double res = Math.PI * Math.pow(r, 2) * h;
			if(res>max) {
				max = res;
				maxName = name;
			}
		}
		System.out.println(maxName);
	}
}
