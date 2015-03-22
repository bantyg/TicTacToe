package com.tictactoe;

import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Board extends{
    Map<JButton,Integer> buttons = new HashMap<JButton,Integer>();
    JFrame frame = new JFrame("game");
    public void setProperties(){
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3,3,20,20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setGrids(){
        ActionEvent act = new ActionEvent();
        for (int i = 11; i <=33 ; i++) {
            if((i%10) <= 3){
                JButton bb = new JButton();
                bb.setSize(2,2);
                bb.setAlignmentX(Button.CENTER_ALIGNMENT);
                bb.setAlignmentY(Button.CENTER_ALIGNMENT);
                bb.setText("" + i);
                bb.setHideActionText(true);
                frame.add(bb);
                frame.setResizable(false);
            }
            else{
                i+=6;
            }
        }
        System.out.println(buttons);
    }
}
