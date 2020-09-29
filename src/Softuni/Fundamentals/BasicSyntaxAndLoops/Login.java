package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		boolean blocked = false;
		int maxBlock = 0;
		int k = 0;
		while(blocked==false) {
			String passTry = sc.nextLine();
			for(int i = 1;i<=pass.length();i++) {
				for(int m = 1;m<=passTry.length();m++) {
					if(pass.charAt(i) == passTry.charAt(m)) {
						k++;
						System.out.println("correct");
					}
				}
			}
			if(k==pass.length()) {
				blocked=true;
				System.out.printf("User %s logged in.", pass);
				break;
			}
			else {
				System.out.println("Incorrect password. Try again.");
				maxBlock++;
			}
			if(maxBlock==4) {
				System.out.printf("User %s blocked!", pass);
				blocked=true;
				break;
			}
		}
	}
}
