package Softuni.Fundamentals.Methods;
import java.util.Scanner;

public class CenterPoint {
	public static double CPoing(int x,int y) {
		return Math.sqrt(Math.pow(Math.abs(x), 2) + Math.pow(Math.abs(y), 2));
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = Integer.parseInt(sc.nextLine());
		int y1 = Integer.parseInt(sc.nextLine());
		int x2 = Integer.parseInt(sc.nextLine());
		int y2 = Integer.parseInt(sc.nextLine());
		if(CPoing(x1, y1)<CPoing(x2, y2)) {
			System.out.printf("(%d, %d)",x1,y1);
		}
		else {
			System.out.printf("(%d, %d)",x2,y2);
		}
	}
}
