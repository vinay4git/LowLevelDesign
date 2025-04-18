package LowLevelDesigns.ATMDesign.objects;

import LowLevelDesigns.ATMDesign.state.AtmState;
import LowLevelDesigns.ATMDesign.state.IdleAtmStateImpl;

public class StateMain {
    public static void main(String[] args) {
        AtmState st = new IdleAtmStateImpl();

    }
}
