//package com.playground.squash;
//
//import com.playground.squash.model.PointOutcome;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PARGameTest {
//
//    private Game game;
//
//    @BeforeEach
//    void setUp() {
//        game = new PARGame(11, true);
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
//        game.submitPoint(PointOutcome.P2_WIN);
//        // 1 - 3
//        assertEquals(1, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 2 - 3
//        assertEquals(2, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 3 - 3
//        assertEquals(3, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 4 - 3
//        assertEquals(4, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 5 - 3
//        assertEquals(5, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 6 - 3
//        assertEquals(6, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 7 - 3
//        assertEquals(7, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 8 - 3
//        assertEquals(8, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 9 - 3
//        assertEquals(9, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 10 - 3
//        assertEquals(10, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertFalse(game.isEndOfGame());
//
//        game.submitPoint(PointOutcome.P1_WIN);
//        // 11 - 3
//        assertEquals(11, game.getPlayer1Score());
//        assertEquals(3, game.getPlayer2Score());
//        assertTrue(game.isEndOfGame());
//
//        assertThrows(Exception.class, () -> {
//           game.submitPoint(PointOutcome.P1_WIN);
//        });
//
//    }
//
//}