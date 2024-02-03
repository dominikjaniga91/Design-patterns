package org.patterns.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChristmasTreeDecoratorTest {

    @Test
    void shouldReturnDecoratedChristmasTree() {
        //given
        final String expectedDescription = "Artificial tree with lights with chain with bauble";
        final Tree artificialTree = new ArtificialTree();

        //when
        final String actualDescription = new BaubleDecorator(
                new ChainDecorator(
                        new LightsDecorator(artificialTree)
                )
        ).decorate();

        //then
        Assertions.assertEquals(expectedDescription, actualDescription);

    }
}
