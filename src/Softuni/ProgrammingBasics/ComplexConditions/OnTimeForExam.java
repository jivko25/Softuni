package Softuni.ProgrammingBasics.ComplexConditions;

import java.util.Scanner;

public class OnTimeForExam {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int hourE;
		int minuteE;
		int hour;
		int minute;
		do {
			hourE = sc.nextInt();
		}
		while(hourE<0 || hourE>23);
		do {
			minuteE = sc.nextInt();
		}
		while(minuteE<0 || minuteE>59);
		do {
			hour = sc.nextInt();
		}
		while(hour<0 || hour>23);
		do {
			minute = sc.nextInt();
		}
		while(minute<0 || minute>59);
		int time = (hour*60)+minute;
		int timeE = (hourE*60)+minuteE;
		if(timeE-time == 0) {
			System.out.println("On time");
		}
		if(timeE-time <=30 && timeE-time>0) {
			if((timeE-time)/60<1) {
				System.out.printf("On time \n%d minutes before the start", (timeE-time)%60);
			}
			else if((timeE-time)/60>=1) {
				if((timeE-time)%60 >10) {
					System.out.printf("On time \n%d:%d hours before the start", (timeE-time)/60, (timeE-time)%60);
				}
				else if((timeE-time)%60 <10) {
					System.out.printf("On time \n%d:0%d hours before the start", (timeE-time)/60, (timeE-time)%60);
				}
			}
		}
		else if(timeE-time > 30) {
			if((timeE-time)/60<1) {
			System.out.printf("Early \n%d minutes before the start", (timeE-time)%60);
		}
			else if((timeE-time)/60>=1) {
				if((timeE-time)%60 >10) {
					System.out.printf("Early \n%d:%d hours before the start", (timeE-time)/60, (timeE-time)%60);
				}
				else if((timeE-time)%60 <10) {
					System.out.printf("Early \n%d:0%d hours before the start", (timeE-time)/60, (timeE-time)%60);
				}
			}
		}
		else if(timeE-time <0) {
			if((time-timeE)/60<1) {
			System.out.printf("Late \n%d minutes after the start",(time-timeE)%60);
			}
			else if((time-timeE)/60>=1) {
				if((time-timeE)%60 >10) {
					System.out.printf("Late \n%d:%d hours after the start", (time-timeE)/60, (time-timeE)%60);
				}
				else if((time-timeE)%60 <10) {
					System.out.printf("Late \n%d:0%d hours after the start", (time-timeE)/60, (time-timeE)%60);
				}

			}
		}
		
	}
}
