package ru.mirea.lab7;

public class MovableRectangleTest {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 10, 2, 3);

        System.out.println("Initial position of the rectangle:");
        System.out.println("Top left: " + rectangle.topLeft);
        System.out.println("Bottom right: " + rectangle.bottomRight);

        rectangle.moveUp();

        System.out.println("Position of the rectangle after moving up:");
        System.out.println("Top left: " + rectangle.topLeft);
        System.out.println("Bottom right: " + rectangle.bottomRight);

        System.out.println("Do the two points have the same speed? " + rectangle.SpeedTest());
    }
}
