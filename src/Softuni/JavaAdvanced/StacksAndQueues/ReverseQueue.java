package Softuni.JavaAdvanced.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>(); 
		String [] arr = sc.nextLine().split(" ");
		for(int i = 0;i<arr.length;i++) {
			stack.add(Integer.parseInt(arr[i]));
		}
		for(int i = 0;stack.size()>0;i++) {
			System.out.print(stack.pop() + " ");
		}
		
	}
}
