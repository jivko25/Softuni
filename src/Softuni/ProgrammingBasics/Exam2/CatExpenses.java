package Softuni.ProgrammingBasics.Exam2;

import java.util.Scanner;

public class CatExpenses {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double bed = Double.parseDouble(sc.nextLine());
		double WC = Double.parseDouble(sc.nextLine());
		double food = WC * 1.25;
		double toys = food * 0.5;
		double vet = toys * 1.1;
		double sum = WC + food + toys + vet;
		double add = sum * 0.05;
		System.out.printf("%.2f lv.", bed + 12*add + 12*sum);
	}
}
