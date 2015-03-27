package com.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Integer> xPosition = new ArrayList<Integer>();
    List<Integer> oPosition = new ArrayList<Integer>();

    public void storeUserInput(int user1input) {
        if(xPosition.size()<=oPosition.size()){
            xPosition.add(user1input);
        }
        else
            oPosition.add(user1input);
    }

    public boolean isAlreadyGiven(int user1input) {
        if(xPosition.contains(user1input) || oPosition.contains(user1input)){
            System.out.println("Position already entered");
            return true;
        }
        return false;
    }

}

