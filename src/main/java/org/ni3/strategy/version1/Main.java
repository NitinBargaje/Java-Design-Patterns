package org.ni3.strategy.version1;

/**
 * @version 1
 * Simple example of use of inheritance, we have specified some common behaviour of duck in
 * {@link Duck} class, this behaviour inherited by {@link MallardDuck} and {@link RedHeadDuck} class
 * also we have one abstract method in {@link Duck} class, implementation for this method will be
 * enforced by compiler for all subclassed of {@link Duck} class
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Duck duck1 = new RedHeadDuck();
        duck.display();
        duck.quack();
        duck.swim();
        duck1.display();
        duck1.quack();
        duck1.swim();
    }
}
