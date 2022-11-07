package org.example.animals;

public class Dog extends Mammals implements Predator {

    @Override
    public void sleep() {
        System.out.println("hr-hr-hr...");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eats dog food.");

    }

    @Override
    public String sound() {
        return "Bark!";
    }

    @Override
    public void consume(String prey) {
        System.out.println("Dog eats " + prey);
    }
}
