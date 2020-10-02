package Softuni.Fundamentals.Arrays;
import java.util.Scanner;

public class ArrayRotation {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
		String[] arr = numbers.split("\\W+");
		int rotations = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<rotations;i++) {
			String temp = arr[0];
			for(int k = 0;k<arr.length-1;k++) {
				arr[k] = arr[k+1];
			}
			arr[arr.length-1] = temp;
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
