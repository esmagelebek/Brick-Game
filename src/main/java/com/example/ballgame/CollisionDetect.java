package com.example.ballgame;

public interface CollisionDetect {
    enum CollisionFrom{VERTICAL,HORIZONTAL};
    public static final int verticalCollision = 1;
    public CollisionFrom isCollision(ballGame ball);
}
