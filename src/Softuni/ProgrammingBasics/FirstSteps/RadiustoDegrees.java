package Softuni.ProgrammingBasics.FirstSteps;
import java.util.Scanner;

public class RadiustoDegrees {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radians = Double.parseDouble(scan.nextLine());
		double degrees = radians * 180 / Math.PI;
		System.out.println(Math.round(degrees));
	}

}
