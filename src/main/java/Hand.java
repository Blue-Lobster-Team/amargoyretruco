package src.main.java;
import src.main.java.Card.Card;
import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void clear() {
        cards.clear();
    }

    public void drawHand(Deck deck) {
        for (int i = 0; i < 3; i++) {
            addCard(deck.drawCard());
        }
    }

    // Envido Code
    public int envido() {
        int maxEnvido = 0;
        boolean envidoCheck = false;

        for (int i = 0; i < cards.size(); i++) {
            for (int j = i + 1; j < cards.size(); j++) {
                Card card1 = cards.get(i);
                Card card2 = cards.get(j);

                if (card1.getSuit() == card2.getSuit()) {
                    int envido = 20+(calculateEnvidoValue(card1) + calculateEnvidoValue(card2));
                    maxEnvido = Math.max(maxEnvido, envido);
                    envidoCheck = true;
                }
            }
        }

        if (!envidoCheck) {
            maxEnvido = calculateHighestValue();
        }

        return maxEnvido;
    }

    private int calculateEnvidoValue(Card card) {
        int value = card.getRank().getValue();
        if (value == 10 || value >= 8) {
            return 0;
        } else {
            return value;
        }
    }

    private int calculateHighestValue() {
        int highestValue = 0;

        for (Card card : cards) {
            int value = calculateEnvidoValue(card);
            if (value > highestValue) {
                highestValue = value;
            }
        }
        return highestValue;
    }
}
