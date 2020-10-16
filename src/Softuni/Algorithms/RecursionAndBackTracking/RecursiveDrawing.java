package Softuni.Algorithms.RecursionAndBackTracking;
import java.util.Scanner;

public class RecursiveDrawing {
	public static void Draw (int n,char c,boolean k,int max) {
		if(n == max+1 && k == true) {
			return;
		}
		if(n > 1 && k == false) {
			for(int i = 0;i<n;i++) {
				System.out.print(c);
			}
			n--;
			System.out.println();
			Draw(n,c,k,max);
		}
		else if(n == 1) {
			System.out.print(c);
			c = '#';
			System.out.println();
			System.out.print(c);
			System.out.println();
			n++;
			k = true;
			Draw(n,c,k,max);
		}
		else if(n > 1 && k == true){
			for(int i = 0;i<n;i++) {
				System.out.print(c);
			}
			n++;
			System.out.println();
			Draw(n,c,k,max);
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Draw(n,'*',false,n);
	}
}
