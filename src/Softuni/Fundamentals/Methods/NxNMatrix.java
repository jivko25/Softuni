package Softuni.Fundamentals.Methods;
import java.util.Scanner;

public class NxNMatrix {
	public static void Matrix(int n) {
		for(int i =1;i<=n;i++) {
			for(int k = 1;k<=n;k++) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Matrix(n);
	}
}
