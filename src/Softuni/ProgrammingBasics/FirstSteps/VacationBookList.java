package Softuni.ProgrammingBasics.FirstSteps;
import java.util.Scanner;

public class VacationBookList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Pages;
		int PagesPerHour;
		int NumberOfDays;
		do {
			System.out.println("Enter number of pages:");
			Pages = sc.nextInt();
		}
		while(Pages<=1 && Pages>= 1000);
		do {
			System.out.println("Pages per hour:");
			PagesPerHour = sc.nextInt();
		}
		while(PagesPerHour<=1 && PagesPerHour>= 1000);
		do {
			System.out.println("Days:");
			NumberOfDays = sc.nextInt();
		}
		while(NumberOfDays<=0 && NumberOfDays>= 1000);
		double solution = Pages/(PagesPerHour*NumberOfDays);
		System.out.print(solution);
	}

}