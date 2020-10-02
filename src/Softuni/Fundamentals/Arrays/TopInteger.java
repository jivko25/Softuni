package Softuni.Fundamentals.Arrays;
import java.util.Scanner;

public class TopInteger {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split(" ");
		int m = 0;
		for(int i = 0;i<arr.length;i++) {
			int max = Integer.parseInt(arr[i]);
			boolean valid = true;
			for(int k = arr.length-1;k>i;k--) {
				int n = Integer.parseInt(arr[k]);
				if(n>=max) {
					valid = false;
					break;
				}
			}
			if(valid == true) {
				System.out.print(max + " ");
			}
		}
	}
}