package com.example.ballgame;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class GameLabel extends Label {
    GameLabel(){
        setFont(new Font(30));
        setLayoutY((double) BallGameApplication.height / 2);
        setVisible(false);
    }

    public void show(String message) {
        setText(message);
        System.out.println(getWidth());
        setLayoutX((double) BallGameApplication.width /2 - 100);
        setVisible(true);
    }

    public void clear(){
        setVisible(false);
    }
}
