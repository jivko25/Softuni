package Softuni.Exam;

import java.util.Scanner;

public class BestPlayer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String player;
		int goals;
		String bestPlayer = null;
		int max = 0;
		do {
			player = sc.nextLine();
			if(player.equals("END")) {
				break;
			}
			goals = Integer.parseInt(sc.nextLine());
			if(goals>max) {
				max = goals;
				bestPlayer = player;
			}
			if(goals >= 10) {
				break;
			}
		}
		while(player.equals("END") == false);
		System.out.format("%s is the best player! \n", bestPlayer);
		if(max>=3) {
			System.out.format("He has scored %d goals and made a hat-trick !!!", max);
		}
		else {
			System.out.format("He has scored %d goals.", max);
		}
	}
}
