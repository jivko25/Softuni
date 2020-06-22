package Softuni.FirstSteps;
import java.util.Scanner;

public class USDtoBGN {
	public static double solution(double usd) {
		double bgn = usd * 1.79549;
		return(bgn);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter usd:");
		double usd = sc.nextDouble();
		double sol = solution(usd);
		System.out.println(sol);
	}

}
