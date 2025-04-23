package DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation;

import DesignPatterns.behavioral.I_VisitorePattern.Room.DeluxeRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.LuxuryRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.SingleRoom;

public class PricingVisitor implements Visitor{
    @Override
    public void visit(SingleRoom hotelRoom) {
        System.out.println("Single Room Pricing strategy");
    }

    @Override
    public void visit(DeluxeRoom hotelRoom) {

    }

    @Override
    public void visit(LuxuryRoom hotelRoom) {

    }
}
