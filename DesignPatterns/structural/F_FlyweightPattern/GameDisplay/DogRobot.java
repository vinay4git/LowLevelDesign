package DesignPatterns.structural.F_FlyweightPattern.GameDisplay;

public class DogRobot implements Robot{
    private String shape;
    private byte[] imageToDisplay;

    public DogRobot(String shape, byte[] imageToDisplay) {
        this.shape = shape;
        this.imageToDisplay = imageToDisplay;
    }

    @Override
    public void displayPosition(int row, int column) {
        System.out.println("Display Dog robot at " + row + "," + column);
    }
}
