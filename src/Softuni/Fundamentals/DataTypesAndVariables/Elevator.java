package Softuni.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int p = Integer.parseInt(sc.nextLine());
		int res = n/p;
		if(n%p>0) {
			res++;
		}
		System.out.print(res);
	}
}
