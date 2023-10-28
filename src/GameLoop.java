package src;
import src.Cards.Card;
import src.Players.Player;
import src.Cards.Deck;

import java.util.List;
import java.util.Scanner;

public class GameLoop {
    private boolean isRunning;

    Player player1 = new Player("null");
    Player player2 = new Player("null");

    public void start() {
        //Start game
        isRunning = true;
        System.out.println("Game started.");
        gameLoop();
        // Initialize players and deck
        // Game loop
        System.out.println("Game over.");
    }

    private void gameLoop(){
        while (isRunning && (player1.getScore() < 15 || player1.getScore() < 15)) {
            // Update game logic
            gameUpdate();
        }
    }

    private void gameUpdate() {
        // generate a deck
        Deck trucodeck = new Deck();
        trucodeck.shuffle();
        // Ask for player names
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player 1 name: ");
        player1.setName(scanner.nextLine());

        System.out.print("Enter Player 2 name: ");
        player2.setName(scanner.nextLine());

        //Each player draws 3 cards
        player1.drawCards(trucodeck);
        player2.drawCards(trucodeck);

        // Print cards
        System.out.println();
        System.out.println(player1.getName() + "'s hand: \n" + player1.getHand());
        System.out.println();
        System.out.println(player2.getName() + "'s hand: \n" + player2.getHand());
        System.out.println();
        updateScore();

        //playEnvido();
        playCard();
        
    }

    private void playEnvido(){
        Scanner scanner = new Scanner(System.in);

        //Player decides to plays envido

        System.out.println(player1.getName()+", would you like to play envido?");
        String playerDecision = scanner.nextLine().toLowerCase();

        switch (playerDecision.toLowerCase()){
            case "yes", "y":
                player1.getHand();
                player1.calculateEnvidoPoints();
                break;
            case "no", "n":
                break;
            default:
                System.out.println("Invalid input, try again");
                System.out.println();
                playEnvido();
                break;
        }
    }

    public void playCard(){
        System.out.println(player1.getName()+", What card would you like to play?");
         List<Card> hand = player1.getHand();

        int cardIndex = new Scanner(System.in).nextInt();

        if (hand.size() < cardIndex) {
            throw new IndexOutOfBoundsException();
        }
        Card SelectedCard1 = hand.get(cardIndex-1);
        System.out.println(SelectedCard1);
        hand.remove(cardIndex-1);
        System.out.println(hand.size() + " cards remaining");
    }

    private void updateScore(){
        player1.setScore(15);
    }
    public void ShowCards(){

    }

}