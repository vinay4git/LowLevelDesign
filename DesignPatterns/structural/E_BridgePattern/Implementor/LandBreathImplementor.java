package DesignPatterns.structural.E_BridgePattern.Implementor;

public class LandBreathImplementor implements BreathImplementor {
    @Override
    public void breathe() {
        System.out.println("Breaths on Land");
    }
}
