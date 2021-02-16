package Softuni.JavaAdvanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class BalancedParentheses {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> left = new ArrayDeque<String>();
		ArrayDeque<String> right = new ArrayDeque<>();
		String [] input = sc.nextLine().split("");
		HashMap<String, String> closingChar = new HashMap<>();
		closingChar.put(")", "(");
		closingChar.put("(", ")");
		closingChar.put("}", "{");
		closingChar.put("{", "}");
		closingChar.put("]", "[");
		closingChar.put("[", "]");
		boolean check = true;
		for (int i = 0; i < input.length; i++) {
			left.offer(input[i]);
			right.push(input[i]);
		}
//		System.out.println(left.poll());
//		System.out.println(right.pop());
		while(!left.isEmpty()) {
			if(!closingChar.get(left.poll()).equals(right.pop())) {
				check = false;
			}
		}
		if(check) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
//		while(!deque.isEmpty()) {
//			System.out.print(deque.poll());
//		}
	}
}
