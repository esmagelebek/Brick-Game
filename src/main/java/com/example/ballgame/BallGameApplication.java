package com.example.ballgame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BallGameApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public static final int width = 600;
    public static final int height = 600;


    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Game(), width, height);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }



    }


