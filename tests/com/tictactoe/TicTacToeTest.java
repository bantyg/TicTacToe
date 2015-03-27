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

    @Test
    public void firstPlayerShouldWinTheGame(){
        User user = new User();
        TicTacToe t = new TicTacToe();
        user.storeUserInput(1);
        user.storeUserInput(2);
        user.storeUserInput(5);
        user.storeUserInput(6);
        user.storeUserInput(9);
        assertEquals(t.hasWin(user),true);
    }

    @Test
    public void gameShouldBeDraw(){
        User user = new User();
        TicTacToe t = new TicTacToe();
        user.storeUserInput(1);
        user.storeUserInput(2);
        user.storeUserInput(3);
        user.storeUserInput(5);
        user.storeUserInput(4);
        user.storeUserInput(7);
        user.storeUserInput(8);
        user.storeUserInput(9);
        user.storeUserInput(6);
        assertEquals(t.hasWin(user),false);
    }
}