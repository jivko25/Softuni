package Softuni.NestedLoops;

import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int k = 1;
		boolean isBigger = false;
		for(int rows = 1;rows<=n;rows++) {
			for(int cols = 1;cols<=rows;cols++) {
				if(k>n) {
					isBigger = true;
					break;
				}
				System.out.print(k + " ");
				k++;
			}
			if(isBigger) {
				break;
			}
			System.out.println();
		}
	}
}
