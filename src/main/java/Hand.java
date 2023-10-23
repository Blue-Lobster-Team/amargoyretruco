package src.main.java;
import src.main.java.Card.Card;
import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand(){
        cards = new ArrayList<>();
    }
    public void addCard(Card card){
        cards.add(card);
    }

    public void removeCard(Card card){
        cards.remove(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void clear(){
        cards.clear();
    }

    public void drawHand(Deck deck){
        for (int i = 0; i < 3; i++){
            addCard(deck.drawCard());
        }
    }

    public int envido() {
        boolean hasSameSuit = false;
        Card envidoCard1 = null;
        Card envidoCard2 = null;
        int envidoPoints = 0;

        for (int i = 0; i < cards.size(); i++) {
            Card card1 = cards.get(i);
            for (int j = i + 1; j < cards.size(); j++) {
                Card card2 = cards.get(j);
                if (card1.getSuit() == card2.getSuit()) {
                    hasSameSuit = true;
                    envidoCard1 = card1;
                    envidoCard2 = card2;
                    break;
                }
            }
        }

        if (hasSameSuit=true) {
            int value1 = envidoCard1.getRank().getValue();
            int value2 = envidoCard2.getRank().getValue();
            envidoPoints = Math.abs(value1 - value2) + 20;
        }

        return envidoPoints;
    }


}
