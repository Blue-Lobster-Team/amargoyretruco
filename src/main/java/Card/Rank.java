package src.main.java.Card;

public enum Rank {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    TEN(10),
    SOTA(10),
    HORSE(10),
    KING(10);

    public int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}