package Softuni.Fundamentals.Arrays;
import java.util.Scanner;

public class MagicSum {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split(" ");
		int targetSum = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<arr.length-1;i++) {
			for(int k = i;k<arr.length;k++) {
				if(i == k) {
					continue;
				}
				if((Integer.parseInt(arr[i]) + Integer.parseInt(arr[k])) == targetSum) {
					System.out.println(arr[i] + " " + arr[k]);
				}
			}
		}
	}
}
