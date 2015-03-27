package com.tictactoe;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    @Test
    public void showPositioningShouldShow(){
        Board b = new Board();
        User user = new User();
        user.storeUserInput(1);
        user.storeUserInput(2);
        assertEquals(b.showPositioning(user.xPosition, user.oPosition), "X O -\n- - -\n- - -");
    }

    @Test
    public void storeUserInputShouldStoreTheGivenUserValues(){
        User user = new User();
        user.storeUserInput(1);
        user.storeUserInput(2);
        user.storeUserInput(3);
        List<Integer> expexted1 = new ArrayList<Integer>();
        List<Integer> expexted2 = new ArrayList<Integer>();
        expexted1.add(1);
        expexted1.add(3);
        expexted2.add(2);
        assertEquals(user.xPosition,expexted1);
        assertEquals(user.oPosition,expexted2);
    }
}