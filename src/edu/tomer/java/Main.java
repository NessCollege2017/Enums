package edu.tomer.java;

import edu.tomer.java.race.Driver;
import edu.tomer.java.race.DriverInspector;
import edu.tomer.java.zoo.Cow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {




    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(Person.moshe());
        people.add(Person.david());
        people.add(Person.moshe2());
        people.add(Person.david2());


        Collections.sort(people);

        System.out.println(people);















        String aba = "Aba";
        String ada = "Aba";

        int diff = ada.compareTo(aba);
        System.out.println(diff);
        System.out.println("\n\n\n\n\n\n");










        Cow cow = new Cow("Matilda");
        DriverInspector.tester(cow);











       BlackJackRank[] ranks = BlackJackRank.values();
        for (BlackJackRank rank : ranks) {
            System.out.println(rank);
        }

        //RED, GREEN, BLUE are the values.
	    // write your code here
        Colors c = Colors.BLUE;

        //init with value
        Colors green = Colors.valueOf("GREEN");
        //==Colors.GREEN;

        //init with a class...
        Colors red = Enum.valueOf(Colors.class, "RED");


        //iterate all the values.
        Colors[] values = Colors.values();

        for (Colors val : values) {
            System.out.println(val);
        }

        LocalDateTime instance = LocalDateTime.now();
        //new LocalDateTime();
//        //Array->List
//        List<Colors> cList = Arrays.asList(values);
//





    }
}
