package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class Ages {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = Integer.parseInt(sc.nextLine());
		if(age<=2 && age>=0) {
			System.out.println("baby");
		}
		else if(age>2 && age<=13) {
			System.out.println("child");
		}
		else if(age>13 && age<=19) {
			System.out.println("teenager");
		}
		else if(age>19 && age<=65) {
			System.out.println("adult");
		}
		else if(age>65) {
			System.out.println("elder");
		}
		else {
			System.out.println("inclusive");
		}
	}
}
