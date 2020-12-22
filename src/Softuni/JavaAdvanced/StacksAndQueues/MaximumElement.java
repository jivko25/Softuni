package Softuni.JavaAdvanced.StacksAndQueues;

import java.util.*;

public class MaximumElement {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> tempStack = new Stack<>();
		int max = 0;
		for(int i = 0;i<n;i++) {
			String [] input = sc.nextLine().split(" ");
			switch (input[0]) {
			case "1":
				stack.push(Integer.parseInt(input[1]));
				if(Integer.parseInt(input[1]) >max) {
					max = Integer.parseInt(input[1]);
				}
				break;
			case "2":
				if(stack.size() == 0) {
					
				}
				else {
				stack.pop();
				}
				break;
			case "3":
				if(stack.size() == 0) {
					System.out.println(0);
				}
//				else {
//				int max = 0;
//				for(int k = 0;0<tempStack.size();k++) {
//					if(tempStack.peek()>max) {
//						max = tempStack.pop();
//					}
//					else {
//						tempStack.pop();
//					}
//					System.out.println(stack);
//				}
					System.out.println(max);
//				}
				break;

			default:
				break;
			}
		}
	}
}
