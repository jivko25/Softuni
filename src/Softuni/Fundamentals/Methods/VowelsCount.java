package Softuni.Fundamentals.Methods;

import java.util.Scanner;

public class VowelsCount {
	public static int VowelsCount(String word) {
		int vowels = 0;
		for(int i = 1;i<word.length();i++) {
			char part = word.charAt(i);
			if(part=='a' || part=='e' || part=='i' || part=='o' || part=='u' || part=='y' || part=='A' || part=='E' || part=='I' || part=='O' || part=='U' || part=='Y') {
				vowels++;
			}
		}
		return vowels;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int res = VowelsCount(word);
		System.out.println(res);
	}
}
