package Softuni.Fundamentals.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split(" ");
//		System.out.println(arr[arr.length-1]);
		int combo = 0;
		int max = 0;
		int index = 0;
		for(int i = 0;i<arr.length-2;i++) {
			if(arr[i].equals(arr[i+1])) {
				combo++;
				if(combo>max) {
					max = combo;
					index = i-1;
				}
			}
			else {
				combo = 0;
			}
		}
//		System.out.println(max + ";" + index);
		for(int i = index;i<=index+max;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
