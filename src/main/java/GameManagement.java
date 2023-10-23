package src.main.java;
import src.main.java.Card.Card;
import java.util.List;
import java.util.Scanner;
public class GameManagement {
    private Player player1;
    private Player player2;
    private Deck deck;

    private int envidoPoints;

    public GameManagement(String player1Name, String player2Name){
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        deck = new Deck();
        envidoPoints = 0;
    }

    public void startGame(){
        System.out.println("Welcome to Bitter & Re-trick!");

        //GameLoop

        while (true){

            //Game Starts

            System.out.println("---------------------------------------------------------");
            System.out.println("Player 1"+player1.getPlayerName());
            System.out.println("Score: "+player1.getScore());
            System.out.println("Player 2"+player2.getPlayerName());
            System.out.println("Score: "+player2.getScore());
            System.out.println("---------------------------------------------------------");

            envidoPoints = 0;
//            envidoPhase();
//            TrucoPhase();

            //Check for game end

            if (player1.getScore() >= 15 || player2.getScore() >= 15){
                System.out.println("Game over !");
                if (player1.getScore() > player2.getScore()) {
                    System.out.println(player1.getPlayerName() + " wins the game!");
                } else if (player1.getScore() < player2.getScore()) {
                    System.out.println(player2.getPlayerName() + " wins the game!");
                } else {
                    System.out.println("It's a tie game!");
                }
                break;
            }

            //Wait for user input to start next round

            System.out.println("Press Enter to continue to the next round or press the Escape key to quit the game...");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("Game continued to the next round.");
            } else {
                System.out.println("Game ended by user.");
                return; // End the game by returning from the method
            }

            //Draw 3 cards

            player1.getHand().drawHand(deck);
            player2.getHand().drawHand(deck);

            List<Card> player1Hand = player1.getHand().getCards();

            //Phase 1

            // Reset Deck

            deck.initializeDeck();
            deck.shuffle();

        }

    }

    public void truco(){

    }
}
