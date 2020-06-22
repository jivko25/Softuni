package Softuni.FirstSteps;
import java.util.Scanner;

public class CharityCampaign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days;
		int cookers;
		int cakes;
		int waffels;
		int pancake;
		do {
			days = sc.nextInt();
		}
		while(days<0 && days>365);
		
		do {
			cookers = sc.nextInt();
		}
		while(days<0 && days>1000);
		
		do {
			cakes = sc.nextInt();
		}
		while(days<0 && days>2000);
		
		do {
			waffels = sc.nextInt();
		}
		while(days<0 && days>2000);
		
		do {
			pancake = sc.nextInt();
		}
		while(days<0 && days>2000);
		
		double result = ((cakes*45 + waffels*5.8 + pancake*3.2)*cookers*days)*0.875;
		System.out.format("%.2f", result);
		
	}
}
