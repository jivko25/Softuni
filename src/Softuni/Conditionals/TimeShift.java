package Softuni.Conditionals;

import java.util.Scanner;

public class TimeShift {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours;
		int minutes;
		do {
			hours = sc.nextInt();
		}
		while(hours<0 || hours>24);
		do {
			minutes = sc.nextInt();
		}
		while(minutes<0 || minutes>60);
		if(minutes + 15 >= 60) {
			hours = hours + 1;
			minutes = (minutes+15)%60;
			if(hours == 24) {
				hours = 0;
			}
			if(minutes == 0) {
				minutes = 0;
			}
			if(minutes<10) {
				System.out.printf("%d:0%d", hours, minutes);
			}
			else {
			System.out.printf("%d:%d", hours, minutes);
			}
		}
		else {
			minutes = (minutes+15)%60;
			if(hours == 24) {
				hours = 0;
			}
			if(minutes == 0) {
				minutes = 0;
			}
			if(minutes<10) {
				System.out.printf("%d:0%d", hours, minutes);
			}
			else {
			System.out.printf("%d:%d", hours, minutes);
			}
		}
	}

}
