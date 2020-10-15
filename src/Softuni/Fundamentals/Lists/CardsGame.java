package Softuni.Fundamentals.Lists;
import java.util.LinkedList;
import java.util.Scanner;

public class CardsGame {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String strFirstPlayer = sc.nextLine();
		String strSecondPlayer = sc.nextLine();
		LinkedList<Integer> firstPlayer= new LinkedList<Integer>();
		LinkedList<Integer> secondPlayer= new LinkedList<Integer>();
		String [] arr1 = strFirstPlayer.split(" ");
		String [] arr2 = strSecondPlayer.split(" ");
		boolean FPWinner = false;
		boolean SCWinner = false;
		for (int i = 0; i < arr1.length; i++) {
			firstPlayer.addFirst(Integer.parseInt(arr1[i]));
		}
		for (int i = 0; i < arr2.length; i++) {
			secondPlayer.addFirst(Integer.parseInt(arr2[i]));
		}
		while(firstPlayer.size() != 0 && secondPlayer.size() != 0) {
			if(firstPlayer.getFirst() > secondPlayer.getFirst()) {
				firstPlayer.addLast(firstPlayer.getFirst());
				firstPlayer.addLast(secondPlayer.getFirst());
				firstPlayer.removeFirst();
				secondPlayer.removeFirst();
			}
			else if(firstPlayer.getFirst() < secondPlayer.getFirst()) {
				secondPlayer.addLast(secondPlayer.getFirst());
				secondPlayer.addLast(firstPlayer.getFirst());
				firstPlayer.removeFirst();
				secondPlayer.removeFirst();
			}
			else if(firstPlayer.getFirst() == secondPlayer.getFirst()) {
				firstPlayer.removeFirst();
				secondPlayer.removeFirst();
			}
			
			if(firstPlayer.size() == 0) {
				SCWinner = true;
			}
			else if(secondPlayer.size() == 0) {
				FPWinner = true;
			}
		}
		if(FPWinner == true) {
			int sum = 0;
			for(int i = 0;firstPlayer.size()>0;i++) {
				sum += firstPlayer.getFirst();
				firstPlayer.removeFirst();
			}
			System.out.printf("First player wins! Sum: %d",sum);
		}
		else if(SCWinner == true) {
			int sum = 0;
			for(int i = 0;secondPlayer.size()>0;i++) {
				sum += secondPlayer.getFirst();
				secondPlayer.removeFirst();
			}
			System.out.printf("Second player wins! Sum: %d",sum);
		}
	}
}
