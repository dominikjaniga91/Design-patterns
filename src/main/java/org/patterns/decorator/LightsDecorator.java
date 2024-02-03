package org.patterns.decorator;

class LightsDecorator extends TreeDecorator {

    private final Tree christmastTree;

    public LightsDecorator(Tree christmastTree) {
        super(christmastTree);
        this.christmastTree = christmastTree;
    }

    String decorate() {
        String decorate = christmastTree.decorate();
        return String.format("%s with lights", decorate);
    }
}
