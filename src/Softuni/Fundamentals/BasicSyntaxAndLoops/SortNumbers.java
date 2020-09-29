package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class SortNumbers {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int first = Integer.parseInt(sc.nextLine());
		int second = Integer.parseInt(sc.nextLine());
		int third = Integer.parseInt(sc.nextLine());
		int [] arr = {first,second,third};
		for(int i = 0;i<3;i++) {
			for(int k = 0; k<3;k++) {
				if(arr[i]>arr[k]) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		for(int i = 0;i<3;i++) {
			System.out.println(arr[i]);
		}
	}
}
