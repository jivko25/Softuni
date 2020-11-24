package Softuni.Fundamentals.TextProcessing;

import java.util.*;

public class ExtractFile {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr1 = input.split("\\\\");
		String [] arr2 = arr1[arr1.length-1].split("\\.");
		System.out.printf("File name: %s\nFile extension: %s",arr2[0], arr2[1]);
	}
}
