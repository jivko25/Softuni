package Softuni.Fundamentals.Methods;

import java.util.Scanner;

public class PasswordValidator {
	public static void PasswordChecher(String password) {
		int digit = 0;
		if(password.length()<6 || password.length()>10) {
			System.out.println("Password must be between 6 and 10 characters");
		}
		for(int i = 1;i<password.length();i++) {
			int check = password.charAt(i);
			if(check >= 48 || check <= 57) {
				digit++;
			}
		}
		if(digit<3) {
			System.out.println("Password must have at least 2 digits");
		}
		for(int i = 1;i<password.length();i++) {
			int check = password.charAt(i);
			if((check < 65 || check > 122) ) {
				System.out.println("Password must consist only of letters and digits");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		PasswordChecher(password);
	}
}
