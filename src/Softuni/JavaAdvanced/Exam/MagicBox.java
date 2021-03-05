package Softuni.JavaAdvanced.Exam;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MagicBox {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] firstInput = sc.nextLine().split("\\s+");
		String [] secondInput = sc.nextLine().split("\\s+");
		
		ArrayDeque<Integer> firstBox = new ArrayDeque<>();
		ArrayDeque<Integer> secondBox = new ArrayDeque<>();
		ArrayDeque<Integer> finalBox = new ArrayDeque<>();
		
		for(int i = 0;i<firstInput.length;i++){
			firstBox.offer(Integer.parseInt(firstInput[i]));
		}
		
		for(int i = 0;i<secondInput.length;i++){
			secondBox.push(Integer.parseInt(secondInput[i]));
		}
		
		while(!firstBox.isEmpty() && !secondBox.isEmpty()) {
			int firstItem = firstBox.peek();
			int secondItem = secondBox.pop();
			if((firstItem + secondItem) % 2 == 0) {
				finalBox.push(firstItem + secondItem);
				firstBox.poll();
			}
			else {
				firstBox.offer(secondItem);
			}
		}
		if(firstBox.isEmpty()) {
			System.out.println("First magic box is empty.");
		}
		if(secondBox.isEmpty()) {
			System.out.println("Second magic box is empty.");
		}
		int sum = 0;
		while(!finalBox.isEmpty()) {
			sum += finalBox.pop();
		}
		if(sum>90) {
			System.out.printf("Wow, your prey was epic! Value: %d", sum);
		}
		else {
			System.out.printf("Poor prey... Value: %d", sum);
		}
		
	}
}
