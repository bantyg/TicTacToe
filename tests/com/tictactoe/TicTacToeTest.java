package com.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeTest {
    @Test
    public void getWelcomeMessageWillShowWelcomeMessage(){
        TicTacToe t = new TicTacToe();
        String msg = "Welcome to TicTacToe \n position Format \n"+
                "1 2 3\n4 5 6\n7 8 9";
        assertEquals(msg, t.getWelcomeMessage());
    }



}