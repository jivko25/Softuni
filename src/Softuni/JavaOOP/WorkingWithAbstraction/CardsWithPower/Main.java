package Softuni.JavaOOP.WorkingWithAbstraction.CardsWithPower;

import java.util.*;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		String secondLine = sc.nextLine();
		System.out.printf("Card name: %s of %s; Card power: %d", CardsPowerEnum.valueOf(firstLine), CardSuitsEnum.valueOf(secondLine),CardsPowerEnum.valueOf(firstLine).getPower() + CardSuitsEnum.valueOf(secondLine).getSuit() );
	}
}
