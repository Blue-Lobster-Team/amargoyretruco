package src;

import src.Cards.Deck;
import src.Players.Player;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player = new Player("John Doe");
        for (int i = 0; i < 4; i++) {
            player.drawCard(deck);
        }
    }
}