package Softuni.JavaOOP.WorkingWithAbstraction.CardsWithPower;

public enum CardSuitsEnum {
	CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suit;

    CardSuitsEnum(int suit){
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }
}
