package Softuni.ProgrammingBasics.NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		boolean isFinished = false;
		double overSum = 0;
		int k = 0;
		while(isFinished == false) {
			double sum = 0;
			String title = sc.nextLine();
			if("Finish".equals(title)) {
				isFinished = true;
				break;
			}
			k++;
			for(int i = 1;i<=n;i++) {
				double grade = Double.parseDouble(sc.nextLine());
				sum = sum + grade;
			}
			System.out.printf("%s - %.2f.\n", title, sum/n);
			overSum = overSum + sum/n;
		}
		System.out.printf("Student's final assessment is %.2f.",overSum/k );
	}
}
