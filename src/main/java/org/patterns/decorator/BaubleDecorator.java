package org.patterns.decorator;

class BaubleDecorator extends TreeDecorator {

    private final Tree christmastTree;

    public BaubleDecorator(Tree christmastTree) {
        super(christmastTree);
        this.christmastTree = christmastTree;
    }

    String decorate() {
        String decorate = christmastTree.decorate();
        return String.format("%s with bauble", decorate);
    }
}
