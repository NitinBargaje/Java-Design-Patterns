package org.ni3.strategy.version3;

/**
 * @version 2
 * Suppose we got requirement to add new flying behaviour for Duck
 * In this version we have added flying behaviour to {@link Duck} class
 * so that same behaviour will be used by all subclasses
 *
 * later in time we added new {@link RubberDuck} to our DuckSimuLink app
 * But we got issue here, since Rubber Duck doesn't fly, still flying behaviour is
 * inherited from {@link Duck class}, We will be solving this in next version of code, checkout here
 * @see org.ni3.strategy.version1.Main
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Duck duck1 = new RubberDuck();
        duck.display();
        duck.quack();
        duck.swim();
        duck.fly();
        duck1.display();
        duck1.quack();
        duck1.swim();
        duck1.fly();
    }
}
