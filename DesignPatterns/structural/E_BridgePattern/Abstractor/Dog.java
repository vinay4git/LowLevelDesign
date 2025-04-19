package DesignPatterns.structural.E_BridgePattern.Abstractor;

import DesignPatterns.structural.E_BridgePattern.Implementor.BreathImplementor;

public class Dog extends LivingThing{
    public Dog(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathe() {
        breathImplementor.breathe();
    }
}
