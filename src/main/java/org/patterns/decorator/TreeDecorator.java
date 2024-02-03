package org.patterns.decorator;

abstract class TreeDecorator extends Tree {

    private final Tree christmastTree;

    public TreeDecorator(Tree christmastTree) {
        this.christmastTree = christmastTree;
    }

    abstract String decorate();

}
