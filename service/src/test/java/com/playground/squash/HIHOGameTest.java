//package com.playground.squash;
//
//import com.playground.squash.model.PointOutcome;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class HIHOGameTest {
//
//    private Game game;
//
//    @BeforeEach
//    void setUp() {
//        game = new HIHOGame(5, true);
//    }
//
//    @Test
//    public void testGame() throws Exception {
//        // 0 - 0
//        assertEquals(0, game.getPlayer1Score());
//        assertEquals(0, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 1 - 0
//        assertEquals(1, game.getPlayer1Score());
//        assertEquals(0, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P2_WIN);
//        // 1 - 0
//        assertEquals(1, game.getPlayer1Score());
//        assertEquals(0, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P2_WIN);
//        // 1 - 1
//        assertEquals(1, game.getPlayer1Score());
//        assertEquals(1, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P2_WIN);
//        // 1 - 2
//        assertEquals(1, game.getPlayer1Score());
//        assertEquals(2, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 1 - 2
//        assertEquals(1, game.getPlayer1Score());
//        assertEquals(2, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 2 - 2
//        assertEquals(2, game.getPlayer1Score());
//        assertEquals(2, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 3 - 2
//        assertEquals(3, game.getPlayer1Score());
//        assertEquals(2, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 4 - 2
//        assertEquals(4, game.getPlayer1Score());
//        assertEquals(2, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 5 - 2
//        assertEquals(5, game.getPlayer1Score());
//        assertEquals(2, game.getPlayer2Score());
//        assertTrue(game.isEndOfGame());
//
//        assertThrows(Exception.class, () -> {
//           game.submitPoint(PointOutcome.P1_WIN);
//        });
//
//    }
//
//}