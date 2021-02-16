package Softuni.JavaAdvanced.StacksAndQueues;

import java.util.*;

public class BasicStackOperations {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		String [] NSX = sc.nextLine().split(" ");
		String [] arr = sc.nextLine().split(" ");
		int min = 5000000;
		boolean isStackContainElement = false;
		for (int i = 0; i < Integer.parseInt(NSX[0]); i++) {
			stack.add(Integer.parseInt(arr[i]));		
		}
		for (int i = 0; i < Integer.parseInt(NSX[1]); i++) {
			stack.pop();		
		}
		for (int i = 0; i < stack.size(); i++) {
			if(stack.peek()<min) {
				min = stack.peek();
			}
			if(stack.contains(Integer.parseInt(NSX[2]))) {
				System.out.print(stack.contains(Integer.parseInt(NSX[2])));
				isStackContainElement = true;
				break;
			}
			stack.pop();
		}
		if(!isStackContainElement) {
			if(min == 5000000) {
				min = 0;
			}
			System.out.println(min);
		}
	}
}
