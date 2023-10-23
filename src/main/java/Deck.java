package src.main.java;
import src.main.java.Card.Card;
import src.main.java.Card.Suit;
import src.main.java.Card.Rank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck (){
        cards = new ArrayList<Card>();
        initializeDeck();
        shuffle();
    }

    public void initializeDeck(){
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        if(cards.isEmpty()){
            throw new IllegalStateException("Deck is empty");
        }
        return cards.remove(cards.size()-1);
    }
}
