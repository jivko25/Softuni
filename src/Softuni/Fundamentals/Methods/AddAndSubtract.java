package Softuni.Fundamentals.Methods;
import java.util.Scanner;

public class AddAndSubtract {
	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int subtrack(int sum, int n) {
		int res = sum - n;
		return res;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		System.out.println(subtrack(sum(a, b),c));
	}
}
