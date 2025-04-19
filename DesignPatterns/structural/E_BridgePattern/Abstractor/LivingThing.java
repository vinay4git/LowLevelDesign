package DesignPatterns.structural.E_BridgePattern.Abstractor;

import DesignPatterns.structural.E_BridgePattern.Implementor.BreathImplementor;

public abstract class LivingThing {
    BreathImplementor breathImplementor;

    public LivingThing(BreathImplementor breathImplementor) {
        this.breathImplementor = breathImplementor;
    }

    public abstract void breathe();
}
