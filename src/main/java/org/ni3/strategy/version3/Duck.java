package org.ni3.strategy.version3;

public abstract class Duck {

    void quack() {
        System.out.println("Duck is quacking");
    }

    void swim() {
        System.out.println("Duck is swimming");
    }

    void fly() {
        System.out.println("Duck is flying");
    }

    abstract void display();

}
