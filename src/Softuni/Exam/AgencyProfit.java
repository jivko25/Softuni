package Softuni.Exam;

import java.util.Scanner;

public class AgencyProfit {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int ATickets;
		int KTickets;
		double APrice;
		double KPrice;
		double EPrice;
		double solution;
		ATickets = sc.nextInt();
		KTickets = sc.nextInt();
		APrice = sc.nextDouble();
		EPrice = sc.nextDouble();
//		do {
//			ATickets = sc.nextInt();
//		}
//		while(ATickets<1 || ATickets>400);
//		
//		do {
//			KTickets = sc.nextInt();
//		}
//		while(KTickets<25 || KTickets>120);
//		
//		do {
//			APrice = sc.nextDouble();
//		}
//		while(APrice<100 || APrice>1600);
//		do {
//			EPrice = sc.nextDouble();
//		}
//		while(EPrice<10 || EPrice>50);
		KPrice = APrice*0.3;
		solution = (APrice + EPrice)*ATickets + (KPrice + EPrice)*KTickets;
		System.out.format("The profit of your agency from %s tickets is ", name);
		System.out.format("%.2f lv.", solution*0.2);
	}
}
