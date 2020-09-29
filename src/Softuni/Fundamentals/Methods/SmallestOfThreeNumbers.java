package Softuni.Fundamentals.Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
	public static int smallestNumber(int n,int k,int m) {
		int min = n;
		if(n>k && m>k) {
			min = k;
		}
		else if(n>m && k>m) {
			min = m;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int k = Integer.parseInt(sc.nextLine());
		int m = Integer.parseInt(sc.nextLine());
		int res = smallestNumber(n, k, m);
		System.out.println(res);
	}
}
