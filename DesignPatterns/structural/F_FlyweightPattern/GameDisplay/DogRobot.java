package DesignPatterns.structural.F_FlyweightPattern.GameDisplay;

import java.util.Arrays;

public class DogRobot implements Robot{
    private final String shape;
    private final byte[] imageToDisplay;

    public DogRobot(String shape, byte[] imageToDisplay) {
        this.shape = shape;
        this.imageToDisplay = imageToDisplay;
    }

    @Override
    public void displayPosition(int row, int column) {
        System.out.println("Display Dog robot at " + row + "," + column + " with Shape:" + shape + " imageDetails: "+ Arrays.toString(imageToDisplay));
    }
}
