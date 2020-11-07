package Softuni.Fundamentals.MidExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Chat {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean isEnd = false;
		ArrayList<String> chat = new ArrayList<String>();
		while(isEnd == false) {
			String input = sc.nextLine();
			if("end".equals(input)) {
				isEnd = true;
				break;
			}
			String [] arr = input.split(" ");
			switch (arr[0]) {
			case "Chat":
				chat.add(arr[1]);
				break;
			case "Delete":
				chat.remove(arr[1]);		
				break;
			case "Edit":
				chat.set(chat.indexOf(arr[1]), arr[2]);
				break;
			case "Pin":
				String temp = chat.get(chat.indexOf(arr[1]));
				chat.remove(chat.indexOf(arr[1]));
				chat.add(temp);
				break;
			case "Spam":
				for(int i = 1;i<arr.length;i++) {
					chat.add(arr[i]);
				}
				break;

			default:
				break;
			}
		}
		for(int i = 0;i<chat.size();i++) {
			System.out.println(chat.get(i));
		}
	}
}
