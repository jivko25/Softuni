package Softuni.ProgrammingBasics.Exam1;

import java.util.Scanner;

public class Balls {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int red = 0;
		int orange = 0;
		int yellow = 0;
		int white = 0;
		int black = 0;
		int sum = 0;
		int others = 0;
		String ball;
		for(int i=1;i<=n;i++) {
			ball = sc.next();
			if(ball.equals("red")) {
				sum = sum + 5;
				red++;
			}
			else if(ball.equals("orange")) {
				sum = sum + 10;
				orange++;
			}
			else if(ball.equals("yellow")) {
				sum = sum + 15;
				yellow++;
			}
			else if(ball.equals("white")) {
				sum = sum + 20;
				white++;
			}
			else if(ball.equals("black")) {
				sum = sum/2;
				black++;
			}
			else {
				others++;
			}
		}
		System.out.format("Total points: %d \n", sum);
		System.out.format("Points from red balls: %d \n", red);
		System.out.format("Points from orange balls: %d \n", orange);
		System.out.format("Points from yellow balls: %d \n", yellow);
		System.out.format("Points from white balls: %d \n", white);
		
		System.out.format("Other colors picked: %d \n", others);
		
		System.out.format("Divides from black balls: %d", black);
	}
}
