package org.patterns.decorator;

class ChristmasTreeFactory {

    public static void main(String[] args) {
        Tree tree = new BaubleDecorator(
                        new ChainDecorator(
                                new LightsDecorator(
                                        new ArtificialTree()
                                )
                        )
        );

        System.out.println(tree.decorate());
    }
}
