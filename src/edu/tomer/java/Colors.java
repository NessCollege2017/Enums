package edu.tomer.java;

/**
 * Created by Tomer on 10/03/2017.
 */
//public static final
public enum Colors {
    RED(1) ,GREEN(2), BLUE(3); //values="RED, GREEN, BLUE"  Colors.values()-> Colors[]

    private int aVal; //-> for the Constructor.

    //alt + insert -> generate constructor:
    //no access modifier.
    private Colors(int aVal) {
        this.aVal = aVal;
    }

    //fromString
    public static Colors fromInt(int n){
        //return new Colors(n);
        for (Colors c : values()) {
            if(c.aVal == n)
                return c;
        }
        return null; //throw exception.
    }
}
