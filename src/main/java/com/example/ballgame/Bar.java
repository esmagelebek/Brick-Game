package com.example.ballgame;

import javafx.scene.shape.Rectangle;

public class Bar extends Rectangle implements CollisionDetect{
    public static final double width = 100.0d;
    public static final double height = 20.0d;
    Bar(){
        super(BallGameApplication.width/2, BallGameApplication.height - 40,100, 20);
        setArcHeight(20);
        setArcWidth(20);
    }


    @Override
    public CollisionFrom isCollision(ballGame ball) {
        if(ball.getDirection() == ballGame.Direction.TOP_RIGHT || ball.getDirection() == ballGame.Direction.TOP_LEFT) return null;

        if(getBoundsInParent().intersects(ball.getBoundsInParent())){
            double ballPosY = ball.getCenterY();

            if(getY()<ballPosY && getY()+height > ballPosY){
                return CollisionFrom.VERTICAL;
            }else {
                return CollisionFrom.HORIZONTAL;
            }
        }
        return null;
    }
}
