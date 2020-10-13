package Softuni.Fundamentals.Methods;
import java.util.Scanner;

public class DataTypes {
	public static void PrintInt(String type,int value) {
			System.out.println(value*2);
	}
	
	public static void PrintReal(String type,double value) {
		System.out.printf("%.2f",value*1.5);
	}
	
	public static void PrintString(String type,String value) {
		System.out.printf("$%s$", value);
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		if("int".equals(type)) {
			int n = Integer.parseInt(sc.nextLine());
			PrintInt(type, n);
		}
		else if("real".equals(type)) {
			double n = Double.parseDouble(sc.nextLine());
			PrintReal(type, n);
		}
		else if("string".equals(type)) {
			String n = sc.nextLine();
			PrintString(type, n);
		}
	}
}
