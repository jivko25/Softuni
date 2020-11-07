package Softuni.Fundamentals.MidExam;

import java.util.Scanner;

public class CookingMaster {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double budjet = Double.parseDouble(sc.nextLine());
		int students = Integer.parseInt(sc.nextLine());
		double flour = Double.parseDouble(sc.nextLine());
		double egg = Double.parseDouble(sc.nextLine());
		double apron = Double.parseDouble(sc.nextLine());
		double apronSum =Math.ceil(students * 1.2) * apron;
		double eggSum = students * 10 * egg;
		double flourSum = 0;
		if(students >= 5) {
			flourSum = (students * flour) - Math.floor(students/5)*flour;
		}
		else {
			flourSum = students * flour;
		}
		double sum = apronSum + eggSum + flourSum;
		if(sum>budjet) {
			System.out.printf("%.2f$ more needed.",sum - budjet);
		}
		else {
			System.out.printf("Items purchased for %.2f$.",sum);
		}
	}
}
