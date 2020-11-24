package Softuni.Fundamentals.TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] arr = sc.nextLine().split(", ");
		for(int i = 0; i<arr.length;i++) {
			if(isUsernameValid(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
	
	static boolean isUsernameValid(String input) {
		if(input.length()<3 || input.length()>16) {
			return false;
		}
		for(int i = 0;i<input.length();i++) {
			char part = input.charAt(i);
			if(!Character.isLetterOrDigit(part) && part != '_' && part != '-') {
				return false;
			}
		}
		return true;
	}
}
