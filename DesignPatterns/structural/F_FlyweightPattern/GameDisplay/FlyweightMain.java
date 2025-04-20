package DesignPatterns.structural.F_FlyweightPattern.GameDisplay;

public class FlyweightMain {
    public static void main(String[] args) {
        Robot dog1 = RobotFlyweightFactory.getRobot("Dog");
        dog1.displayPosition(1,1);

        Robot human1 = RobotFlyweightFactory.getRobot("Human");
        human1.displayPosition(1,0);

        Robot dog2 = RobotFlyweightFactory.getRobot("Dog");
        dog2.displayPosition(1,3);
    }
}
