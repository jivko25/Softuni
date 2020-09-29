package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class Login2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		int passwordSum = 0;
		int nextTrySum = 0;
		int n = 0;
		for(int i = 1;i<password.length();i++) {
			char ch = password.charAt(i);
			int value = ch;
			passwordSum += value;
		}
		System.out.println(passwordSum);
		while(passwordSum != nextTrySum) {
			nextTrySum = 0;
		String nextTry = sc.nextLine();
		for(int i = 1;i<nextTry.length();i++) {
			char ch = nextTry.charAt(i);
			int value = ch;
			nextTrySum += value;
		}
		System.out.println(nextTrySum);
		n++;
		if(nextTrySum == passwordSum) {
			System.out.printf("User %s logged in", password);
			break;
		}
		else if(n == 4) {
			System.out.printf("User %s blocked!", password);
			break;
		}
		else {
			System.out.println("Incorrect password. Try again");
		}
		}		
	}
}
