package Softuni.Fundamentals.Methods;

import java.util.Scanner;

public class CharactersInRange {
	public static void Characters(char a, char z) {
		int num1 = a;
		int num2 = z;
		if(num1>num2) {
			num1 = z;
			num2 = a;
		}
		for(int i = 1;i<num2;i++) {
			char res = (char) (num1 + i);
			if(res == z || res == a) {
				break;
			}
			System.out.print(res + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char z = sc.next().charAt(0);
		Characters(a, z);
	}
}
