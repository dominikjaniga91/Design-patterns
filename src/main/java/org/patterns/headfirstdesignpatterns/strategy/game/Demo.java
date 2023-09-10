package org.patterns.headfirstdesignpatterns.strategy.game;

class Demo {

    public static void main(String[] args) {

        Character king = new King(new Sword());
        Character queen = new Queen(new BowAndArrow());
        Character troll = new Troll(new Axe());
        Character knight = new Knight(new Knife());

        Characters characters = new Characters(king, queen, troll, knight);

        for (Character character : characters) {
            character.performFight();
        }
    }
}
