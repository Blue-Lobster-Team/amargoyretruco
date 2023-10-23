package src.main.java;
import src.main.java.Card.Card;
import src.main.java.Card.Suit;
import src.main.java.Card.Rank;

public class truco_game {
    public static void main(String[] args) {

        // Create a new instance of Hand
        Hand hand = new Hand();

        // Add some cards to the hand
        Card card1 = new Card(Suit.CLUBS, Rank.SIX);
        Card card2 = new Card(Suit.CUPS, Rank.SEVEN);
        Card card3 = new Card(Suit.COINS, Rank.KING);

        hand.addCard(card1);
        hand.addCard(card2);
        hand.addCard(card3);

        System.out.println(hand.envido());
    }
}
