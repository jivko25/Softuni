package Softuni.ProgrammingBasics.FirstSteps;
import java.util.Scanner;

public class DepositCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double depsum;
		int time;
		double percent;
		double percentin;
		do {
			System.out.println("Enter deposit sum:");
			depsum = sc.nextDouble();
		}
		while(depsum<=100 && depsum>= 10000);
		do {
			System.out.println("Enter deposit time:");
			time = sc.nextInt();
		}
		while(time<=1 && time>= 12);
		do {
			System.out.println("Enter deposit percent:");
			percentin = sc.nextDouble();
			percent = percentin * 0.01;
		}
		while(percentin<=0 && percentin>= 100);
		double solution = depsum + time*((depsum * percent)/12);
		System.out.print(solution);
	}

}
