package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class MultiplicationTable2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int k = Integer.parseInt(sc.nextLine());
		if(k<10) {
			for(int i = k;i<=10;i++) {
				System.out.printf("%d X %d = %d\n", n, i, n*i);
			}
		}
		else {
			System.out.printf("%d X %d = %d", n, k, n*k);
		}
	}
}
