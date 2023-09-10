package org.patterns.headfirstdesignpatterns.strategy.game;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

class Characters implements Iterable<Character> {

    private final List<Character> characterList;

    public Characters(Character... characters) {
        this.characterList = Arrays.asList(characters);
    }

    @Override
    public void forEach(Consumer<? super Character> action) {
        this.characterList.forEach(action);
    }

    @Override
    public Spliterator<Character> spliterator() {
        return this.characterList.spliterator();
    }

    @Override
    public Iterator<Character> iterator() {
        return this.characterList.iterator();
    }
}
