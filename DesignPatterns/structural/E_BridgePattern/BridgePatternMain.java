package DesignPatterns.structural.E_BridgePattern;

import DesignPatterns.structural.E_BridgePattern.Abstractor.Dog;
import DesignPatterns.structural.E_BridgePattern.Abstractor.Fish;
import DesignPatterns.structural.E_BridgePattern.Abstractor.LivingThing;
import DesignPatterns.structural.E_BridgePattern.Implementor.LandBreathImplementor;
import DesignPatterns.structural.E_BridgePattern.Implementor.WaterBreatheImplementor;

public class BridgePatternMain {
    public static void main(String[] args) {
        LivingThing dog = new Dog(new LandBreathImplementor());
        dog.breathe();

        LivingThing fish = new Fish(new WaterBreatheImplementor());
        fish.breathe();
    }
}
