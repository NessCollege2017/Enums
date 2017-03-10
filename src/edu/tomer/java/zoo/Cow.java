package edu.tomer.java.zoo;

import edu.tomer.java.race.Driver;

/**
 * Created by Tomer on 10/03/2017.
 */
public class Cow extends Animal implements Driver, Runnable{

    public Cow(String name) {
        super(Food.GRASS, name);
    }

    @Override
    void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    @Override
    public void run() {

    }
}
