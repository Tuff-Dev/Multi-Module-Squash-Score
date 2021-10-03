package com.playground.squash;

import com.playground.squash.model.PointOutcome;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class RunApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }

    private final Scanner sc = new Scanner(System.in);

    @Override
    public void run(String... args) throws Exception {
        Game game = setupGame();
        printToConsole(game.toString());

        while(!game.isEndOfGame()) {
            printToConsole("Who won the point?\n- (1) Player 1\n- (2) Player 2");
            int pointWinner = sc.nextInt();

            if (pointWinner == 1) {
                game.submitPoint(PointOutcome.P1_WIN);
            } else {
                game.submitPoint(PointOutcome.P2_WIN);
            }
        }

        printToConsole("Game finished.");
        printToConsole(game.toString());

    }

    private Game setupGame() {
        // Get type of scoring
        printToConsole("What scoring system would you like to use?\n- (1) PAR (Point a Rally)\n- (2) HIHO (Hand-In-Hand-Out)");
        int scoringType = sc.nextInt();

        printToConsole("Playing first to...?");
        int firstTo = sc.nextInt();

        // Get Player names
        printToConsole("Enter player 1's name:");
        String player1Name = sc.next();
        printToConsole("Enter player 2's name:");
        String player2Name = sc.next();

        printToConsole("Who is serving?\n- (1) " + player1Name + "\n- (2) " + player2Name);
        int servingPlayer = sc.nextInt();

        printToConsole("Serving from left? Y/N");
        String left = sc.next();
        boolean servingFromLeft = false;
        if (left.equalsIgnoreCase("Y")) {
            servingFromLeft = true;
        }


        boolean p1Serving = true;
        if (servingPlayer == 2) {
            p1Serving = false;
        }


        if (scoringType == 1) {
            return new PARGame(firstTo, p1Serving, servingFromLeft);
        } else {
            return new HIHOGame(firstTo, p1Serving, servingFromLeft);
        }
    }

    private void printToConsole(String message) {
        System.out.println(message);
    }

}
