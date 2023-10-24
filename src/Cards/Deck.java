package src.Cards;
import java.util.ArrayList;
import java.util.List;

public class Deck {
    public List<Card> cards = new ArrayList<>();

    public Deck() {
        cards = new ArrayList<>();

        for (Card.Rank rank : Card.Rank.values()) {
            Card cupsCard = new CupsCard(rank, Card.Suit.CUPS);
            Card swordsCard = new SwordsCard(rank, Card.Suit.SWORDS);
            Card coinsCard = new CoinsCard(rank, Card.Suit.SWORDS);
            Card clubsCard = new ClubsCard(rank, Card.Suit.SWORDS);

            cards.add(cupsCard);
            cards.add(swordsCard);
            cards.add(coinsCard);
            cards.add(clubsCard);
        }
    }

    public String getCardsToString(){
        StringBuilder sb = new StringBuilder();
        for(Card card: cards){
            sb.append(card.toString());
        }
        return sb.toString();
    }

    public String getDeckSize() {
        Deck deck = new Deck();
        String cardsToString = (deck.getCardsToString());
        String deckSize = (deck.getDeckSize());
        return deckSize + cardsToString;
    }

    public String getAllCardsAsString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Number of cards in the deck: " + deck.cards.size());

        String allCards = deck.getAllCardsAsString();
        System.out.println("All cards in the deck:\n" + allCards);
    }
}
