package DesignPatterns.structural.F_FlyweightPattern.GameDisplay;

public class HumanRobot implements Robot{
    String shape;
    byte[] imageDisplayRender;

    public HumanRobot(String shape, byte[] imageDisplayRender) {
        this.shape = shape;
        this.imageDisplayRender = imageDisplayRender;
    }

    @Override
    public void displayPosition(int row, int column) {
        System.out.println("Display human robot at " + row + "," + column);
    }
}
