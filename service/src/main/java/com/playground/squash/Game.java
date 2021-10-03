package com.playground.squash;

import com.playground.squash.model.PointOutcome;
import com.playground.squash.model.PointResult;
import com.playground.squash.model.exception.EndOfGameException;
import com.playground.squash.model.exception.HandOutRequiredException;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class Game {

    private int player1Score;
    private int player2Score;
    private boolean player1Serving;
    private final List<PointResult> previousPoints;
    private boolean servingFromLeft;
    private final int firstTo;

    public Game(int firstTo, boolean player1Serving, boolean servingFromLeft) {
        this.player1Score = 0;
        this.player2Score = 0;
        this.player1Serving = player1Serving;
        this.previousPoints = new LinkedList<>();
        this.firstTo = firstTo;
        this.servingFromLeft = servingFromLeft;
    }

    public void submitPoint(PointOutcome pointOutcome) throws Exception {
        submitPoint(pointOutcome, null);
    }

    public void submitPoint(PointOutcome pointOutcome, Boolean handoutServeLeft) throws EndOfGameException, HandOutRequiredException {
        if (isEndOfGame()) {
            throw new EndOfGameException("End of game");
        }

        boolean isHandout = isHandout(pointOutcome);
        if (isHandout && handoutServeLeft == null) {
            throw new HandOutRequiredException("Handout side required.");
        }

        previousPoints.add(new PointResult(player1Serving, servingFromLeft, pointOutcome));
        handleNewPoint(pointOutcome);

        if (isHandout) {
            this.servingFromLeft = handoutServeLeft;
        }
    }

    protected abstract void handleNewPoint(PointOutcome pointOutcome);

    public boolean isEndOfGame() {
        return player1Score == firstTo || player2Score == firstTo;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    protected void incrementPlayer1Score() {
        this.player1Score++;
    }

    protected void incrementPlayer2Score() {
        this.player2Score++;
    }

    protected void setPlayer1Serving(boolean player1Serving) {
        this.player1Serving = player1Serving;
    }

    protected boolean isPlayer1Serving() {
        return player1Serving;
    }

    private boolean isHandout(PointOutcome pointOutcome) {
        switch (pointOutcome) {
            case P1_WIN, P1_STROKE -> {
                if (!player1Serving) return true;
            }
            case P2_WIN, P2_STROKE -> {
                if (player1Serving) return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Game{" +
                "player1Score=" + player1Score +
                ", player2Score=" + player2Score +
                ", player1Serving=" + player1Serving +
                ", previousPoints=" + previousPoints +
                ", servingFromLeft=" + servingFromLeft +
                ", firstTo=" + firstTo +
                '}';
    }
}
