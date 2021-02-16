package Softuni.JavaAdvanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
	public static void main(String [] args) {
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		String [] commands = sc.nextLine().split("\\s+");
		String [] input = sc.nextLine().split("\\s+");
		for (int i = 0; i < Integer.parseInt(commands[0]); i++) {
			queue.offer(Integer.parseInt(input[i]));
		}
		for (int i = 0; i < Integer.parseInt(commands[1]); i++) {
			if(!queue.isEmpty()) {
			queue.poll();
			}
		}
		if(queue.contains(Integer.parseInt(commands[2]))) {
			System.out.println(true);
		}
		else {
			if(!queue.isEmpty()) {
			System.out.println(Collections.min(queue));
			}
			else {
				System.out.println(0);
			}
		}
	}
}
