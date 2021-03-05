package Sofuni.JavaAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class MatrixShuffing {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] arrSize = sc.nextLine().split("\\s+");
		String [][] arr = new String [Integer.parseInt(arrSize[1])][Integer.parseInt(arrSize[0])];
		int cols = Integer.parseInt(arrSize[1]);
		int rows = Integer.parseInt(arrSize[0]);
		//fill the array
//		for(int x = 0;x<Integer.parseInt(arrSize[1]);x++) {
//			String [] tempArr = sc.nextLine().split("\\s+");
//			for(int y = 0;y<Integer.parseInt(arrSize[0]);y++) {
//				System.out.println(tempArr[y]);
//				arr[x][y] = tempArr[y];
//			}
//		}
		for(int x = 0;x<rows;x++) {
			String [] tempArr = sc.nextLine().split("\\s+");
			for(int y = 0;y<cols;y++) {
				System.out.println(tempArr[y]);
				arr[y][x] = tempArr[y];
				System.out.println("success");
			}
		}
		printMatrix(arr, Integer.parseInt(arrSize[0]), Integer.parseInt(arrSize[1]) );
		String [] input = sc.nextLine().split("\\s+");
		System.out.println(input[1]);
//		while(!"END".equals(input[0])) {
//			if((Integer.parseInt(input[0]) < Integer.parseInt(arrSize[1])) && (Integer.parseInt(input[1]) < Integer.parseInt(arrSize[0]))) {
//			String temp = arr[Integer.parseInt(input[1])][Integer.parseInt(input[2])];
//			arr[Integer.parseInt(input[1])][Integer.parseInt(input[2])] = arr[Integer.parseInt(input[3])][Integer.parseInt(input[4])];
//			arr[Integer.parseInt(input[3])][Integer.parseInt(input[4])] = temp;
//			}
//			input = sc.nextLine().split("\\s+");
//		}
		printMatrix(arr, Integer.parseInt(arrSize[1]), Integer.parseInt(arrSize[0]) );
	}
	
	public static void printMatrix(String [][] arr, int sizeX, int sizeY) {
		for(int y = 0;y<sizeY;y++) {
			for(int x = 0;x<sizeX;x++) {
					System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println("end");
	}
}
