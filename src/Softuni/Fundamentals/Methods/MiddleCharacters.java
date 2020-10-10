package Softuni.Fundamentals.Methods;
import java.util.Scanner;

public class MiddleCharacters {
	public static void Middle(String word) {
		if(word.length()%2==1) {
			System.out.println(word.charAt((word.length()/2)));
		}
		else {
			System.out.println(word.charAt((word.length()/2)-1) + "" + word.charAt((word.length()/2)));
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		Middle(word);
	}
}
