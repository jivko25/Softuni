package Softuni.Fundamentals.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String [] arr1 = new String [n];
		String [] arr2 = new String [n];
		for(int i = 0;i<n;i++) {
			String content = sc.nextLine();
			int space = content.indexOf(" ");
			String firstPart = content.substring(0, space);
			String secondPart = content.substring(space+1, content.length());
			if(i%2 == 0) {
			arr1[i] = firstPart;
			arr2[i] = secondPart;
			}
			else {
			arr2[i] = firstPart;
			arr1[i] = secondPart;
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0;i<n;i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
