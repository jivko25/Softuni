package Softuni.Fundamentals.Methods;
import java.util.Scanner;

public class FactorialDivision {
	public static double Factorial(int n) {
		double res = 1;
		for(int i = 1;i<=n;i++) {
			res = res*i;
		}
		return res;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		System.out.printf("%.2f",Factorial(a)/Factorial(b));
	}
}
