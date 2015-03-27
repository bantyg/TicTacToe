package com.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
    String winner = "";
    private static List<Integer[]> winningPositions = new ArrayList<Integer[]>();

   static{

        winningPositions.add(new Integer[]{1, 2, 3});
        winningPositions.add(new Integer[]{4, 5, 6});
        winningPositions.add(new Integer[]{7, 8, 9});
        winningPositions.add(new Integer[]{1, 4, 7});
        winningPositions.add(new Integer[]{2, 5, 8});
        winningPositions.add(new Integer[]{3, 6, 9});
        winningPositions.add(new Integer[]{1, 5, 9});
        winningPositions.add(new Integer[]{3, 5, 7});
    }

    public boolean finishingGame(User user, int i) {
        if(hasWin(user.xPosition, user.oPosition)) {
            System.out.println("Winner is " + winner);
            return true;
        }
        if(i ==8){
            System.out.println("the game is draw");
            return false;
        }
        return false;
    }


    public String getWelcomeMessage() {
        return "Welcome to TicTacToe \n position Format \n"+
                "1 2 3\n4 5 6\n7 8 9";
    }

    public boolean hasWin(List<Integer> l1,List<Integer> l2){
        for (Integer[] integer : winningPositions) {
            List<Integer> pos = Arrays.asList(integer);
            if(l1.containsAll(pos)){
                winner = "player1";
                return true;
            }
            if(l2.containsAll(pos)){
                winner = "player2";
                return true;
            }
        }
        return false;
    }
}
