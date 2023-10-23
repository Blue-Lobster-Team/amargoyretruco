package src.main.java.Card;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String toString(){
        return rank.name() + " of " + suit.name();
    }
/*
    public String getImgPath(){
        String suitName = suit.name().toLowerCase();
        String rankName = rank.name().toLowerCase();
        return "src/main/resources/images/cards" + suitName + "_" + rankName + ".png";
    }
*/

}
