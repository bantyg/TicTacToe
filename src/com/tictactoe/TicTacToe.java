package com.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

    public void start() {
        User user = new User();
        Board b = new Board();
        Scanner sc = new Scanner(System.in);
        int position = 0;
        System.out.println(b.showBoard());
        for (int i = 0; i < 9; i++) {
            position = sc.nextInt();
            if(b.isValidPosition(position) && !user.isAlreadyGiven(position)){
                user.storeUserInput(position);
                System.out.println(b.showPositioning(user.xPosition, user.oPosition));
                if(hasWin(user)) {
                    System.out.println("Winner is " + winner);
                    break;
                }
                if(i ==8){
                    System.out.println("the game is draw");
                }
            }
            else
                i--;
        }
    }

    public String getWelcomeMessage() {
        return "Welcome to TicTacToe \n position Format \n"+
                "1 2 3\n4 5 6\n7 8 9";
    }

    public boolean hasWin(User user){
        List<Integer> l1 = user.xPosition;
        List<Integer> l2 = user.oPosition;
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
