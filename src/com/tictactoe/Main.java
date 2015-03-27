package com.tictactoe;

public class Main {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        System.out.println(t.getWelcomeMessage());
        t.start();
    }
}
