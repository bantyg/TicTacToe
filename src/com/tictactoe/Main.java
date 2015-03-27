package com.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        Board b = new Board();
        User user = new User();
        System.out.println(t.getWelcomeMessage());
        Scanner sc = new Scanner(System.in);
        int user1input = 0;
        System.out.println(b.showBoard());
        for (int i = 0; i < 9; i++) {
            user1input = sc.nextInt();
            if(b.isValidPosition(user1input) && !user.isAlreadyGiven(user1input)){
                user.storeUserInput(user1input);
                System.out.println(b.showPositioning(user.xPosition, user.oPosition));
                if(t.hasWin(user.xPosition , user.oPosition)) {
                    System.out.println("Winner is " + t.winner);
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

}
