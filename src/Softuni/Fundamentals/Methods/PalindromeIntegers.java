package Softuni.Fundamentals.Methods;
import java.util.Scanner;

public class PalindromeIntegers {
	public static boolean isIntegerPalindrom(String n) {
		for(int k = 1;k<=n.length()-1;k++) {
			if(n.charAt(k-1) != n.charAt(n.length()-k)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean end = false;
		String number = null;
		while(end==false) {
				number = sc.nextLine();
				if("END".equals(number)) {
					end = true;
					break;
				}
				else {
					System.out.println(isIntegerPalindrom(number));
				}
			}
		}
}
