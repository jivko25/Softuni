package Softuni.FirstSteps;
import java.util.Scanner;

public class FishTank {
	public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	int a;
	int b;
	int c;
	double percent;
	do {
		a = sc.nextInt();
	}
	while(a<10 && a>500);
	do {
		b = sc.nextInt();
	}
	while(b<10 && b>300);
	do {
		c = sc.nextInt();
	}
	while(c<10 && c>200);
	do {
		percent = sc.nextDouble();
	}
	while(a<10 && a>500);
	double result = a*b*c*0.001;
	System.out.format("%.2f",result*(1-(0.01*percent)));
	}
}
