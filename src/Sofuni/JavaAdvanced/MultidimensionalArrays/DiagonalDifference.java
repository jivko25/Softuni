package Sofuni.JavaAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int [][] arr = new int[n][n];
		//fill the array
		for(int x = 0;x<n;x++) {
			String [] tempArr = sc.nextLine().split("\\s+");
			for(int y = 0;y<n;y++) {
				arr[x][y] = Integer.parseInt(tempArr[y]);
			}
		}
		//left-to-right diagonal
		int lrDiagonal = 0;
		for(int i = 0;i<n;i++) {
			lrDiagonal += arr[i][i];
		}
		//right-to-left diagonal
		int rlDiagonal = 0;
		int tempY = 0;
		for(int x = n-1;x>=0;x--) {
			rlDiagonal += arr[x][tempY];
			tempY++;
		}
		System.out.println(Math.abs(rlDiagonal - lrDiagonal));
	}
}
