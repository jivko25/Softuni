package Softuni.Algorithms.RecursionAndBackTracking;
import java.util.Scanner;

public class Generating01Vectors {
	public static int MaxBinaryNumber(int n,int max,int res) {
		if(n == max) {
			return res = (int) (res + Math.pow(2, n));
		}
		else {
			res = (int) (res + Math.pow(2, n));
			n++;
			return MaxBinaryNumber(n, max, res);
		}
	}
	public static void Generator(int n,int max, int r) {
		if(n==max) {
			return;
		}
		else {
		String num = Integer.toBinaryString(n);
		for(int i = num.length();r>=i;i++) {
			System.out.print("0");
		}
		System.out.print(num);
		n++;
		System.out.println();
		Generator(n,max,r);
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Generator(0, MaxBinaryNumber(0, n-1, 1),n-1);
	}
}
