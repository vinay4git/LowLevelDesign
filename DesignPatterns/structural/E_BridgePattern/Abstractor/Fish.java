package DesignPatterns.structural.E_BridgePattern.Abstractor;

import DesignPatterns.structural.E_BridgePattern.Implementor.BreathImplementor;

public class Fish extends LivingThing{
    public Fish(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathe() {
        breathImplementor.breathe();
    }
}
