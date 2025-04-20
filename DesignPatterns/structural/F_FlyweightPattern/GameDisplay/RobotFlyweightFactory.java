package DesignPatterns.structural.F_FlyweightPattern.GameDisplay;

import java.util.HashMap;
import java.util.Map;

public class RobotFlyweightFactory {
    private static final Map<String, Robot> robotCacheMap = new HashMap<>();

    public static Robot getRobot(String robotType){
        if (robotCacheMap.get(robotType) == null){
            if (robotType.equalsIgnoreCase("Dog")) {
                Robot robot = new DogRobot(robotType, null);
                robotCacheMap.put(robotType, robot);
            } else if (robotType.equalsIgnoreCase("Human")) {
                Robot robot = new HumanRobot(robotType, null);
                robotCacheMap.put(robotType, robot);
            }
        }
        return robotCacheMap.get(robotType);
    }
}
