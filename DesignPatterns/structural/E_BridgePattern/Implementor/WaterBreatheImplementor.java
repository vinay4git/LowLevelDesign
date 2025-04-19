package DesignPatterns.structural.E_BridgePattern.Implementor;

public class WaterBreatheImplementor implements BreathImplementor{
    @Override
    public void breathe() {
        System.out.println("Water breath");
    }
}
