package org.patterns.decorator;

class ChainDecorator extends TreeDecorator {

    private final Tree christmastTree;

    public ChainDecorator(Tree christmastTree) {
        super(christmastTree);
        this.christmastTree = christmastTree;
    }

    String decorate() {
        String decorate = christmastTree.decorate();
        return String.format("%s with chain", decorate);
    }
}
