package Softuni.Fundamentals.Lists;
import java.util.ArrayList;
import java.util.Scanner;

public class BombNumbers {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input  = sc.nextLine();
		String [] arr = input.split(" ");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			numbers.add(Integer.parseInt(arr[i]));
		}
		String secondPart = sc.nextLine();
		String [] bomb = secondPart.split(" ");
		int repeats = Integer.parseInt((bomb[1]));
		for(int i = 0;i<numbers.size();i++) {
			repeats = Integer.parseInt((bomb[1]));
			if(numbers.get(i) == Integer.parseInt(bomb[0])) {
				for(int k = 0;k<=repeats;k++) {
					if(i-k >= 0) {
						numbers.set(i-k, 0);
					}
				}
				repeats = Integer.parseInt((bomb[1]));
				for(int n = 0;n<=repeats;n++) {
					if(i+n<numbers.size()) {
						numbers.set(i+n, 0);
					}
				}
				repeats = Integer.parseInt((bomb[1]));
						numbers.set(i, 0);
			}
		}
		int sum = 0;
		for(int i = 0;i<numbers.size();i++) {
			sum += numbers.get(i);
		}
		System.out.printf("\n%d",sum);
	}
}
