package Softuni.Conditionals;

import java.util.Scanner;

public class WorldSwimmingRecord {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double seconds;
		double metres;
		double speed;
		do {
			seconds = sc.nextDouble();
		}
		while(seconds<0 || seconds>100000);
		do {
			metres = sc.nextDouble();
		}
		while(metres<0 || metres>100000);
		do {
			speed = sc.nextDouble();
		}
		while(speed<0 || speed>1000);
		double slow = Math.floor(metres/15) * 12.5;
		double time = slow + (metres * speed);
		if(seconds <= time) {
			System.out.print("No, he failed! He was ");
			System.out.format("%.2f", (seconds - time) * -1);
			System.out.print(" seconds slower.");
		}
		else {
			System.out.print("Yes, he succeeded! The new world record is ");
			System.out.format("%.2f", time);
			System.out.print(" seconds.");
		}
	}

}
