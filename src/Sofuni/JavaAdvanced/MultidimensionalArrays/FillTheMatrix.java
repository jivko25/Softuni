package Sofuni.JavaAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] input = sc.nextLine().split(", ");
		int size = Integer.parseInt(input[0]);
		int [][] arr = new int [size][size];
		if(input[1].equals("A")) {
			arr = AMatrix(size);
		}
		else {
			arr = BMatrix(size);
		}
		
		printMatrix(arr, size);
		
	}
	
	public static void printMatrix(int [][] arr, int size) {
		for(int y = 0;y<size;y++) {
			for(int x = 0;x<size;x++) {
				if(arr[x][y] < 10) {
					System.out.print(arr[x][y] + "  ");
				}
				else {
					System.out.print(arr[x][y] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static int[][] AMatrix(int size){
		int num = 0;
		int [][] arr = new int[size][size];
		for(int x = 0;x<size;x++) {
			for(int y = 0;y<size;y++) {
				num++;
				arr[x][y] = num;
			}
		}
		return arr;
	}
	
	public static int[][] BMatrix(int size){
		int num = 0;
		int [][] arr = new int[size][size];
		for(int x = 0;x<size;x++) {
			if(x%2 == 0) {
				for(int y = 0;y<size;y++) {
					num++;
					arr[x][y] = num;
				}
			}
			else {
				for(int y = size-1;y>=0;y--) {
					num++;
					arr[x][y] = num;
				}
			}
		}
		return arr;
	}
}
