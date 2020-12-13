package Softuni.Fundamentals.FinalExam;

import java.util.Scanner;

public class Task1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String input = sc.nextLine();
		while(!"Done".equals(input)) {
			String [] arr = input.split(" ");
			switch (arr[0]) {
			case "Change":
				String temp = str.replaceAll(arr[1], arr[2]);
				str = temp;
				System.out.println(str);
				break;
			case "Includes":
				if(str.contains(arr[1])) {
					System.out.println("True");
				}
				else {
					System.out.println("False");
				}
				break;
			case "End":
				if(Character.isLetter(str.charAt(str.length()-1))) {
					System.out.println("True");
				}
				else {
					System.out.println("False");
				}
				break;
			case "Uppercase":
				temp = str.toUpperCase();
				str = temp;
				System.out.println(str);
				break;
			case "FindIndex":
				System.out.println(str.indexOf(arr[1]));
				break;
			case "Cut":
				temp = str.substring(Integer.parseInt(arr[1]), Integer.parseInt(arr[1])+Integer.parseInt(arr[2]));
				str = temp;
				System.out.println(str);
				break;

			default:
				break;
			}
			input = sc.nextLine();
		}
	}
}
