package Softuni.Fundamentals.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int success = 0;
		
		String regex = "^U\\$(?<username>[A-Z][a-z]+)U\\$P\\@\\$(?<password>[a-z]{5,}\\d+)P\\@\\$$";
		Pattern pattern = Pattern.compile(regex);
		for(int i = 0;i<n;i++) {
			String input = sc.nextLine();
			Matcher matcher = pattern.matcher(input);
			if(matcher.find()) {
				String username = matcher.group("username");
				String password = matcher.group("password");
				System.out.println("Registration was successful");
				System.out.println("Username: " + username + ", Password: " + password);
				success++;
			}
			else {
				System.out.println("Invalid username or password");
			}
		}
		System.out.println("Successful registrations: "+ success);
	}
}
