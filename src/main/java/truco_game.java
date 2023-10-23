package src.main.java;
import src.main.java.Card.Card;
import src.main.java.Card.Suit;
import src.main.java.Card.Rank;

public class truco_game {
    public static void main(String[] args) {
        GameManagement game = new GameManagement("ElBijas", "JuanCaloh");

        game.startGame();
    }
}
