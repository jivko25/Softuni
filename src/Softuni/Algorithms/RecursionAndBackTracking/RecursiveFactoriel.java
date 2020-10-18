package Softuni.Algorithms.RecursionAndBackTracking;
import java.util.Scanner;

public class RecursiveFactoriel {
	public static int Factoriel(int n,int sum) {
		if(n == 1) {
			return sum;
		}
		else {
		sum = sum * n;
		n--;
		return Factoriel(n, sum);
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(Factoriel(n,1));
	}
}
