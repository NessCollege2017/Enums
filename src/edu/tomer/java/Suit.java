package edu.tomer.java;

/**
 * Created by Tomer on 10/03/2017.
 */
public enum Suit {
    HEARTS("♥"), CLUBS("♣"), SPADES("♠"), DIAMONDS("♦");
    String aVal;
    String fullWord;

    Suit(String aVal) {
        this.aVal = aVal;
        fullWord = super.toString();
    }

    @Override
    public String toString() {
        return aVal;
    }

    public static Suit fromString(String s){
        for (Suit suit : values()) {
            if (s.equals(suit.aVal))
                return suit;
        }
        return null;
    }
}
