package src.main.java;
import src.main.java.Card.Card;

public class Player {
    private String playerName;
    private int score;

    private Hand hand;

    public Player(String playerName){
        this.playerName = playerName;
        this.score = 0;
        this.hand = new Hand();
    }

    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public Hand getHand(){
        return hand;
    }

    public void setHand(Hand hand){
        this.hand = hand;
    }
}
