package Softuni.ProgrammingBasics.WhileLoops;

import java.util.Scanner;

public class TheOldLibrary {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String theBook = sc.nextLine();
		String book = sc.nextLine();
		int n = 0;
		boolean found = false;
		if(book.equals(theBook)) {
			found = true;
			n++;
		}
		while(!book.equals(theBook)) {
			book = sc.nextLine();
			n++;
			if(book.equals(theBook)) {
				found = true;
				break;
			}
			if(book.equals("No More Books")) {
				break;
			}
		};
		if(found == true) {
			System.out.printf("You checked %d books and found it.", n);
		}
		else if (found == false) {
			System.out.printf("The book you search is not here!\nYou checked %d books.", n);
		}
	}
}
