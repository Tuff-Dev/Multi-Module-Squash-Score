package com.playground.squash;

import com.playground.squash.model.PointOutcome;

public class PARGame extends Game {
    public PARGame(int firstTo, boolean player1Serving, boolean servingFromLeft) {
        super(firstTo, player1Serving, servingFromLeft);
    }

    @Override
    protected void handleNewPoint(PointOutcome pointOutcome) {
        switch (pointOutcome) {
            case P1_WIN -> {
                incrementPlayer1Score();
                setPlayer1Serving(true);
            }
            case P2_WIN -> {
                incrementPlayer2Score();
                setPlayer1Serving(false);
            }
        }
    }
}
