package Softuni.JavaOOP.WorkingWithAbstraction.CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for(CardRanksEnum card : CardRanksEnum.values()){
            System.out.printf("Ordinal value: %d; Name value: %s\n", card.ordinal(), card);
        }
    }
}
