package com.playground.squash;

import com.playground.squash.model.PointOutcome;

public class HIHOGame extends Game {
    public HIHOGame(int firstTo, boolean player1Serving, boolean servingFromLeft) {
        super(firstTo, player1Serving, servingFromLeft);
    }

    @Override
    protected void handleNewPoint(PointOutcome pointOutcome) {
        switch (pointOutcome) {
            case P1_WIN, P1_STROKE -> {
                if (isPlayer1Serving()) {
                    incrementPlayer1Score();
                }
                setPlayer1Serving(true);
            }
            case P2_WIN, P2_STROKE -> {
                if (!isPlayer1Serving()) {
                    incrementPlayer2Score();
                }
                setPlayer1Serving(false);
            }
        }
    }
}
