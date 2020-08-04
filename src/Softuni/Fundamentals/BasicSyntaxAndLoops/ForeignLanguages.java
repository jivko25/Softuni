package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class ForeignLanguages {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String country = sc.nextLine();
		String res;
		if("USA".equals(country) || "England".equals(country)) {
			res = "English";
		}
		else if("Spain".equals(country) || "Argentina".equals(country) || "Mexico".equals(country)) {
			res = "Spanish";
		}
		else {
			res = "unknown";
		}
		System.out.println(res);
	}
}
