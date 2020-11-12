package Softuni.Fundamentals.AssociativeArrays;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharsInString {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		HashMap<String, Integer> chars = new HashMap<String, Integer>();
		String [] arr = word.split("");
		for(int i = 0;i<arr.length;i++) {
//		if(chars.get(arr[i]) == null) {
//			chars.put(arr[i], 1);
//		}
//		else {
			chars.put(arr[i], chars.get(arr[i])+ 1);
//		}
		for (String n : chars.keySet()) {
			  System.out.println(n);
			}
		}
	}
}
