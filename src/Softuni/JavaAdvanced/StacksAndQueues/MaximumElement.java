package Softuni.JavaAdvanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
	public static void main(String [] ars) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> stack= new ArrayDeque<>();
		int numberOfCommands = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<numberOfCommands;i++) {
			String command = sc.nextLine();
			String [] arr = command.split("\\s+");
			switch (arr[0]) {
			case "1":
				stack.push(Integer.parseInt(arr[1]));
				break;
			case "2":
				if(!stack.isEmpty()) {
				stack.pop();
				}
				break;
			case "3":
//				int max = findMaxElement(stack);
				int max = Collections.max(stack);
				System.out.println(max);
				break;

			default:
				break;
			}
		}
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
	}
	
	public static int findMaxElement(ArrayDeque<Integer> stack) {
		int max = Integer.MIN_VALUE;
		while(!stack.isEmpty()) {
			int value = stack.pop();
			if(value>max) {
				max = value;
			}
		}
		return max;
	}
}

