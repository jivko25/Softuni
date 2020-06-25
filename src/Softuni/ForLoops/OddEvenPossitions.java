package Softuni.ForLoops;

import java.util.Scanner;

public class OddEvenPossitions {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double maxO = -1000000000;
		double minO = 1000000000;
		double sumO = 0;
		double maxE = -1000000000;
		double minE = 1000000000;
		double sumE = 0;
		for(int i=1; i<=n;i++) {
			double number = sc.nextDouble();
			if(i%2 == 0) {
				if(number>maxE) {
					maxE = number;
				}
				if(minE>number) {
					minE = number;
				}
				sumE = sumE + number;
			}
			else {
				if(number>maxO) {
					maxO = number;
				}
				if(minO>number) {
					minO = number;
				}
				sumO = sumO + number;
			}
		}
		if(n==0) {
			System.out.printf("OddSum=%.2f,\n", sumO);
			System.out.printf("OddMin=No,\n");
			System.out.printf("OddMax=No,\n");
			System.out.printf("EvenSum=%.2f,\n", sumE);
			System.out.printf("EvenMin=No,\n");
			System.out.printf("EvenMax=No");
		}
		else if(n==1) {
			System.out.printf("OddSum=%.2f,\n", sumO);
			System.out.printf("OddMin=%.2f,\n", minO);
			System.out.printf("OddMax=%.2f,\n", maxO);
			System.out.printf("EvenSum=%.2f,\n", sumE);
			System.out.printf("EvenMin=No,\n");
			System.out.printf("EvenMax=No");	
		}
		else {
			System.out.printf("OddSum=%.2f,\n", sumO);
			System.out.printf("OddMin=%.2f,\n", minO);
			System.out.printf("OddMax=%.2f,\n", maxO);
			System.out.printf("EvenSum=%.2f,\n", sumE);
			System.out.printf("EvenMin=%.2f,\n", minE);
			System.out.printf("EvenMax=%.2f", maxE);
		}
	}
}
