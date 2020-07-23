package Softuni.WhileLoops;

import java.util.Scanner;

public class Walking {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean isDone = false;
		int goal = 10000;
		while(isDone == false) {
			String step = sc.nextLine();
			if("Going home".equals(step)) {
				int finalStep = Integer.parseInt(sc.nextLine());
				goal = goal - finalStep;
				if(goal<=0) {
					isDone = true;
				}
				break;
			} else {
				int normalStep = Integer.parseInt(step);
				goal = goal - normalStep;
				if(goal<=0) {
					isDone = true;
					break;
				}
			}
		}
		if(isDone == false) {
			System.out.printf("%d more steps to reach goal.", goal);
		} else {
			System.out.printf("Goal reached! Good job! %d steps over the goal!", Math.abs(goal));
		}
	}
}
