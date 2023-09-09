package org.patterns.headfirstdesignpatterns.duck;

import java.util.List;

class DuckTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck rubberDuck = new RubberDuck();
        Duck readheadDuck = new ReadheadDuck();

        List<Duck> ducks = List.of(mallardDuck, decoyDuck, rubberDuck, readheadDuck);
        for (Duck duck : ducks) {
            duck.display();
            duck.performFly();
            duck.performQuack();
        }
    }
}
