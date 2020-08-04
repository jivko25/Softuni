package Softuni.ProgrammingBasics.FirstSteps;
import java.util.Scanner;

public class BirthDayParty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rent:");
		double rent;
		do {
		rent = sc.nextDouble();
		}
		while(rent<=100 && rent>=10000);
		double cake = 0.2 * rent;
		double drinks = cake - cake*0.45;
		double clown = rent * 1/3;
		double total = rent + drinks + cake + clown;
		System.out.print(total);
}

}
