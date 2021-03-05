package Softuni.JavaOOP.WorkingWithAbstraction.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
        System.out.println("Card Suits:");
        System.out.printf("Ordinal value: %d; Name value: %s\n", CardsEnum.CLUBS.ordinal(), CardsEnum.CLUBS.name());
        System.out.printf("Ordinal value: %d; Name value: %s\n", CardsEnum.DIAMONDS.ordinal(), CardsEnum.DIAMONDS.name());
        System.out.printf("Ordinal value: %d; Name value: %s\n", CardsEnum.HEARTS.ordinal(), CardsEnum.HEARTS.name());
        System.out.printf("Ordinal value: %d; Name value: %s\n", CardsEnum.SPADES.ordinal(), CardsEnum.SPADES.name());
    }
}
