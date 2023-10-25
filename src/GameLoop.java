package src;

import src.Cards.Card;
import src.Players.Player;
import src.Cards.Deck;

import java.util.ArrayList;
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

        player1.drawCards(deck);
        player2.drawCards(deck);

        for (Card card : player1.getHand()) {
            System.out.println(card);
        }
        System.out.println();

        player1.calculateEnvidoPoints();

        System.out.println();

        for (Card card : player2.getHand()) {
            System.out.println(card);
        }
        System.out.println();

        player2.calculateEnvidoPoints();

        System.out.println();

        // Draw cards for each player

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

}