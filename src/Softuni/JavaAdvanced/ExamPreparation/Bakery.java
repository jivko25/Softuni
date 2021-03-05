package Softuni.JavaAdvanced.ExamPreparation;

import java.util.Scanner;

public class Bakery {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int pilars = 0;
		char [][] matrix = new char[n][n];
		
		for(int rows = 0;rows<n;rows++) {
			matrix[rows] = sc.nextLine().toCharArray();
		}
		printMatrix(matrix);
	}
	
	public static void printMatrix(char [][] matrix) {
		for(int x = 0;x<matrix.length;x++) {
			for(int y = 0;y<matrix[x].length;y++) {
				System.out.print(matrix[x][y]);
			}
			System.out.println();
		}
	}
}
