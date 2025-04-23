package DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation;

import DesignPatterns.behavioral.I_VisitorePattern.Room.DeluxeRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.LuxuryRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.SingleRoom;

public class PricingVisitor implements Visitor{
    @Override
    public void visit(SingleRoom hotelRoom) {
        System.out.println("Single Room Pricing strategy");
        hotelRoom.setPrice(10);
    }

    @Override
    public void visit(DeluxeRoom hotelRoom) {
        System.out.println("Deluxe Room Pricing strategy");
        hotelRoom.setPrice(100);
    }

    @Override
    public void visit(LuxuryRoom hotelRoom) {
        System.out.println("Luxury Room Pricing strategy");
        hotelRoom.setPrice(1000);
    }
}
