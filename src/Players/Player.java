package src.Players;

import src.Cards.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;
    private int score;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public void drawCard(Deck deck) {
        if (hand.size() >= 3) {
            System.out.println("Max number of cards drawn");
            return;
        }
        Card card = deck.drawCard();
        if (card != null) {
            hand.add(card);
        } else {
            System.out.println("Deck is empty");
        }
    }
    public String getName() {
        return name;
    }

    public void updateScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }


    public List<Card> getHand() {
        return hand;
    }
}