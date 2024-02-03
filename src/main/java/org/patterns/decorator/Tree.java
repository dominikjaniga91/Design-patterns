package org.patterns.decorator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
abstract class Tree {

    protected String description;

    abstract String decorate();
}
