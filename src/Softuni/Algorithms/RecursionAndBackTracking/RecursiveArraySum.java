package Softuni.Algorithms.RecursionAndBackTracking;
import java.util.Scanner;

public class RecursiveArraySum {
	public static int ArrSum(int [] arr, int n,int sum) {
		sum += arr[n];
		n++;
		if(n == arr.length) {
			return sum;
		}
		return ArrSum(arr,n,sum);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] Sarr = input.split(" ");
		int [] arr = new int [Sarr.length];
		for(int i = 0;Sarr.length>i;i++) {
			arr[i] = Integer.parseInt(Sarr[i]);
		}
		System.out.println(ArrSum(arr,0,0));
	}
}
