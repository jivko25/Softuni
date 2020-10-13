package Softuni.Fundamentals.Methods;
import java.util.Scanner;

public class TopNumber {
	public static void Top(String n) {
		int CharSum = 0;
		boolean oddValid = false;
		boolean eightValid = false;
		for(int i = 1;i<=Integer.parseInt(n);i++) {
			String m = String.valueOf(i);
			for(int k = 0;k<m.length();k++) {
				int charN = m.charAt(k) - 48;
				CharSum+=charN;
				if(m.charAt(k) == '1' || m.charAt(k) == '3' || m.charAt(k) == '5' || m.charAt(k) == '7' || m.charAt(k) == '9') {
					oddValid = true;
				}
			}
			if(CharSum % 8 == 0) {
				eightValid = true;
			}
			if(eightValid == true && oddValid == true) {
				System.out.println(i);
			}
			CharSum = 0;
			oddValid = false;
			eightValid = false;
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String n = 
				sc.nextLine();
		Top(n);
	}
}
