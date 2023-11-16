package ru.mirea.lab6;

public class Main {
    public static void main(String args[]){
        int xSpeed = 2;
        int ySpeed = 2;
        MovableRectangle rect = new MovableRectangle(0,0,0,0,2,2);
        System.out.println(rect.toString());
        rect.moveLeft(xSpeed);
        rect.moveUp(ySpeed);
        System.out.println(rect.toString());
    }
}
