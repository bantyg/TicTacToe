package com.tictactoe;

import java.util.List;

public class Board {

   private char[] positionsInChar = showBoard().toCharArray();

    public String showBoard(){
        return "- - -\n- - -\n- - -";
    }

    public String showPositioning(List<Integer> l1, List<Integer> l2){
        int index1 = l1.get(l1.size()-1);
        int index2=0;
        positionsInChar[(index1 - 1) * 2] = 'X';
        if(l2.size()>0) {
            index2 = l2.get(l2.size() - 1);
            positionsInChar[(index2 - 1) * 2] = 'O';
        }
        return  String.valueOf(positionsInChar);
    }

    public boolean isValidPosition(int user1input) {
        if(user1input <= 9 && user1input > 0){
            return true;
        }
        else{
            System.out.println("Invalid position...\n Enter valid:-");
            return false;
        }
    }
}
