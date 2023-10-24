package src.Players;
import src.Cards.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        if (hand.size() >= 3) {
            System.out.println("Max number of cards drawn");
            return;
        }
        Card card = deck.drawCard();
        if (card != null) {
            hand.add(card);
            System.out.println("Card drawn: " + card);
        } else {
            System.out.println("Deck is empty");
        }
    }
    public List<Card> getHand(){
        return this.hand;
    }
}
