package org.patterns.headfirstdesignpatterns.decorator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Beverage {

    protected String description;
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    double cost() {
        return 0d;
    }
}
