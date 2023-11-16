package ru.mirea.lab6;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
            this.topLeft = new MovablePoint(x1, y1);
            this.bottomRight = new MovablePoint(x2, y2);
        if (!(xSpeed == ySpeed)){
            System.out.println("У точек не совпадает скорость движения. Скорость второй точки будет изменена.");
        }
    }

    @Override
    public void moveUp(int ySpeed){
        this.topLeft.moveUp(ySpeed);
    }
    @Override
    public void moveDown(int ySpeed){
        this.topLeft.moveDown(ySpeed);
    }
    @Override
    public void moveLeft(int xSpeed){
        this.topLeft.moveLeft(xSpeed);
    }
    @Override
    public void moveRight(int xSpeed){
        this.topLeft.moveRight(xSpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
