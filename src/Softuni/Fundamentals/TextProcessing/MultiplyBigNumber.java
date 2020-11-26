package Softuni.Fundamentals.TextProcessing;

import java.util.Scanner;

public class MultiplyBigNumber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(sc.nextLine());
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int res = 0;
		if(b == 0) {
			System.out.println(0);
			return;
		}
		for(int i = a.length() - 1;i>=0;i--) {
			int digit = Integer.parseInt(String.valueOf(a.charAt(i)));
			int result = digit * b + carry;
			
			if(i==0) {
				sb.insert(0,  result);
			}
			else {
				int resDigit = result%10;
				carry = result/10;
				sb.insert(0,resDigit);
			}
		}
		System.out.println(sb);
	}
}
