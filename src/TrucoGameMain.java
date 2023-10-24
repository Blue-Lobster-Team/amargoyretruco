package src;
import src.Cards.*;

public class TrucoGameMain {
    public static void main(String[] args) {
        testTrucoValue();
        testEnvidoValue();
    }

    public static void testTrucoValue() {
        Card card1 = new SwordsCard(Card.Rank.ONE, Card.Suit.SWORDS);
        Card card2 = new CupsCard(Card.Rank.SEVEN, Card.Suit.CUPS);

        System.out.println("Truco Value Test:");
        System.out.println("Card 1 Truco Value: " + card1.trucoValue()); // Expected: 14
        System.out.println("Card 2 Truco Value: " + card2.trucoValue()); // Expected: 4
        System.out.println();
    }

    public static void testEnvidoValue() {
        Card card1 = new SwordsCard(Card.Rank.ONE, Card.Suit.SWORDS);
        Card card2 = new CupsCard(Card.Rank.KING, Card.Suit.CUPS);

        System.out.println("Envido Value Test:");
        System.out.println("Card 1 Envido Value: " + card1.envidoValue()); // Expected: 0
        System.out.println("Card 2 Envido Value: " + card2.envidoValue()); // Expected: 0
        System.out.println();
    }
}
