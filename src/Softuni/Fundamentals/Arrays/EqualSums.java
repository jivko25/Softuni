package Softuni.Fundamentals.Arrays;
import java.util.Scanner;

public class EqualSums {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split(" ");
		boolean find = false;
		for(int i = 0;i<arr.length;i++) {
			int left = 0;
			int right = 0;
			for(int k = 0;k<i;k++) {
				if(i==k) {
					continue;
				}
				int number = Integer.parseInt(arr[k]);
				left += number;
			}
			for(int m = i;m<arr.length;m++) {
				if(i==m) {
					continue;
				}
				int number = Integer.parseInt(arr[m]);
				right += number;
			}
			if(left == right) {
				System.out.println(i);
				find = true;
				break;
			}
		}
		if(find == false) {
			System.out.println("no");
		}
	}
}
