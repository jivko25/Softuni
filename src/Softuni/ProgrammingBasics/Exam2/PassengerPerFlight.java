package Softuni.ProgrammingBasics.Exam2; 

import java.util.Scanner;

public class PassengerPerFlight {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int companies = Integer.parseInt(sc.nextLine());
		double max = 0;
		int maxN = 0;
		String Max = null;
		for(int i = 1;i<=companies;i++) {
			String companyName = sc.nextLine();
			boolean isFinished = false;
			int sum = 0;
			int n = 0;
			while(isFinished == false) {
				String input = sc.nextLine();
				if("Finish".equals(input)) {
					isFinished = true;
					break;
				}
				else {
			    int passengers = Integer.parseInt(input);
			    if(passengers<0) {
			    	continue;
			    }
				sum = sum + passengers;
				n++;
				}
				double avr = Math.floor(sum/n);
			if(sum>max) {
				max = sum;
				maxN = n;
				Max = companyName;
			}
			}
			System.out.printf("%s: %.0f passengers.\n", companyName, Math.floor(sum/n));
		}
		System.out.printf("%s has most passengers per flight: %.0f",Max, Math.floor(max/maxN));
	}
}
