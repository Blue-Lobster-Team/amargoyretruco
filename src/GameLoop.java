package src;

import src.Cards.Card;
import src.Players.Player;
import src.Cards.Deck;

import java.util.Scanner;

public class GameLoop {
    private boolean isRunning;
    private String player1Name;
    private String player2Name;
    private Player player1; // Declare player1 as an instance variable

    public GameLoop() {
        isRunning = false;
    }

    public void start() {
        isRunning = true;
        System.out.println("Game started.");

        // Ask for player names
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player 1 name: ");
        player1Name = scanner.nextLine();

        System.out.print("Enter Player 2 name: ");
        player2Name = scanner.nextLine();

        System.out.println();

        // Initialize players and deck
        player1 = new Player(player1Name); // Assign the player1 object
        Player player2 = new Player(player2Name);
        Deck deck = new Deck();
        deck.shuffle();

        // Draw cards for each player
        drawCards(player1, deck);
        drawCards(player2, deck);

        // Game loop
        while (isRunning) {
            // Update game logic
            update();

            // Render game state
            render();

            // Check for game over condition
            if (isGameOver()) {
                stop();
            }
        }

        System.out.println("Game over.");
    }

    public void stop() {
        isRunning = false;
    }

    private void update() {
        // Update game logic here
    }

    private void render() {
    }

    private boolean isGameOver() {
        // Check game over condition here
        return false;
    }

    private void drawCards(Player player, Deck deck) {
        for (int i = 0; i < 3; i++) {
            player.drawCard(deck);
        }

        System.out.println(player.getName() + " drew the following cards:");
        for (Card card : player.getHand()) {
            System.out.println(card);
        }
        System.out.println();
    }
}