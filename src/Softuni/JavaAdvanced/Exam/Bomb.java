package Softuni.JavaAdvanced.Exam;

import java.util.Scanner;

public class Bomb {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int bombs = 0;
		char [][] matrix = new char[n*2][n*2];
		int heroRow = 0;
		int heroCol = 0;
		boolean exit = false;
		String [] commands = sc.nextLine().split(",");
		for(int rows = 0;rows<n;rows++) {
			String input = sc.nextLine();
			input = input.replaceAll("\\s+", "");
//			System.out.println(input);
			char [] arr = input.toCharArray();
			for(int col = 0;col<arr.length;col++) {
				matrix[rows][col] = arr[col];
			}
//			matrix[rows] = sc.nextLine().toCharArray();
		}
//		printMatrix(matrix);
		heroRow = findHero(matrix)[1];
		heroCol = findHero(matrix)[0];
		bombs = findBombs(matrix);
		for(int i = 0;i<commands.length;i++) {
			switch (commands[i]) {
			case "up":
				if(!(heroRow-1 < 0)) {
				matrix[heroRow][heroCol] = '+';
				if(matrix[heroRow-1][heroCol] == 'B') {
					bombs--;
				}
				else if(matrix[heroRow-1][heroCol] == 'e') {
					exit = true;
				}
				heroRow = heroRow-1;
				matrix[heroRow][heroCol] = 's';
				}
//				System.out.println();
//				printMatrix(matrix);
				break;
			case "down":
				if(!(heroRow+1 >= n)) {
				matrix[heroRow][heroCol] = '+';
				if(matrix[heroRow+1][heroCol] == 'B') {
					System.out.println("You found a bomb!");
					bombs--;
				}
				else if(matrix[heroRow+1][heroCol] == 'e') {
					exit = true;
				}
				heroRow = heroRow+1;
				matrix[heroRow][heroCol] = 's';
				}
//				System.out.println();
//				printMatrix(matrix);		
				break;
			case "right":
				if(!(heroCol+1 >= n)) {
				matrix[heroRow][heroCol] = '+';
				if(matrix[heroRow][heroCol+1] == 'B') {
					System.out.println("You found a bomb!");
					bombs--;
				}
				else if(matrix[heroRow][heroCol+1] == 'e') {
					exit = true;
				}
				heroCol = heroCol+1;
				matrix[heroRow][heroCol] = 's';
				}
//				System.out.println();
//				printMatrix(matrix);
				break;
			case "left":
				if(!(heroCol-1 < 0)) {
				matrix[heroRow][heroCol] = '+';
				if(matrix[heroRow][heroCol-1] == 'B') {
					System.out.println("You found a bomb!");
					bombs--;
				}
				else if(matrix[heroRow][heroCol-1] == 'e') {
					exit = true;
				}
				heroCol = heroCol-1;
				matrix[heroRow][heroCol] = 's';
				}
//				System.out.println();
//				printMatrix(matrix);
				break;

			default:
				break;
			}
			if(exit) {
				break;
			}
		}
		if(bombs==0 && !exit) {
			System.out.println("Congratulations! You found all bombs!");
		}
		else if(exit) {
			System.out.printf("END! %d bombs left on the field", bombs);
		}
		else {
			System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombs, heroRow, heroCol);
		}
//		printMatrix(matrix);
	}
	
	public static void printMatrix(char [][] matrix) {
		for(int x = 0;x<matrix.length;x++) {
			for(int y = 0;y<matrix[x].length;y++) {
				System.out.print(matrix[x][y]);
			}
			System.out.println();
		}
	}
	
	public static int[] findHero(char [][] matrix) {
		int row = 0;
		int col = 0;
		for(int x = 0;x<matrix.length;x++) {
			for(int y = 0;y<matrix[x].length;y++) {
				if(matrix[x][y] == 's') {
					row = y;
					col = x;
					break;
				}
			}
		}
		int [] arr = {row, col};
		return arr;
	}
	
	public static int findBombs(char [][] matrix) {
		int bombs = 0;
		for(int x = 0;x<matrix.length;x++) {
			for(int y = 0;y<matrix[x].length;y++) {
				if(matrix[x][y] == 'B') {
					bombs++;
				}
			}
		}
		return bombs;
	}
}
