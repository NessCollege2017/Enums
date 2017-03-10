package edu.tomer.java.zoo;

/**
 * Created by Tomer on 10/03/2017.
 */
public abstract class Animal {
    private Food f;
    private String name;

    public Animal(Food f, String name) {
        this.f = f;
        this.name = name;
    }

    public void eat(){
        System.out.println(name +" eating " + f);
    }

    abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
