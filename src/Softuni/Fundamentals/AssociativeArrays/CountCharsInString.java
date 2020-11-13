package Softuni.Fundamentals.AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		Map<String, Integer> chars = new HashMap<>();
		String [] arr = word.split("");
		for(int i = 0;i<arr.length;i++) {
		if(chars.get(arr[i]) == null) {
			chars.put(arr[i], 1);
		}
		else {
			chars.put(arr[i], chars.get(arr[i])+ 1);
		}
		}
		chars.remove(" ");
		for (String n : chars.keySet()) {
			String key = n.toString();
            String value = chars.get(n).toString();  
            System.out.println(key + " -> " + value); 
			}
	}
}
