package ru.mirea.lab6;

public class MovablePoint implements Movable{
    private int x;
    private int y;

    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp(int ySpeed){
        this.y += ySpeed;
    }
    @Override
    public void moveDown(int ySpeed){
        this.y -= ySpeed;
    }
    @Override
    public void moveLeft(int xSpeed){
        this.x -= xSpeed;
    }
    @Override
    public void moveRight(int xSpeed){
        this.x += xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
