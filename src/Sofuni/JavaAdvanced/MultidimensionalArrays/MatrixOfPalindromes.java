package Sofuni.JavaAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] input = sc.nextLine().split("\\s+");
		StringBuilder [][] arr = new StringBuilder[Integer.parseInt(input[1])][Integer.parseInt(input[0])];
		int pattern = 97;
		for(int x = 0;x<Integer.parseInt(input[1]); x++) {
			int temp = pattern + x;
			for(int y = 0;y<Integer.parseInt(input[0]); y++) {
				StringBuilder sb = new StringBuilder();
				char tempChar = (char) (pattern+y);
				sb.append(tempChar);
				char newChar = (char) (temp+y);
				sb.append(newChar);
				sb.append(tempChar);
				arr[x][y] = sb;
			}
		}
		printMatrix(arr, Integer.parseInt(input[1]), Integer.parseInt(input[0]));
	}
	
	public static void printMatrix(StringBuilder [][] arr, int sizeX, int sizeY) {
		for(int y = 0;y<sizeY;y++) {
			for(int x = 0;x<sizeX;x++) {
					System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
	}
}
