package Softuni.Exam2;

import java.util.Scanner;

public class SantaClausDelivery {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int M = Integer.parseInt(sc.nextLine());
		int S = Integer.parseInt(sc.nextLine());
		for(int i = M;i>=N;i--) {
			if(i%2 == 0) {
				if(i%3 == 0) {
					if(i==S) {
						break;
					}
					else {
						System.out.printf("%d ", i);
					}
				}
			}
		}
	}
}
