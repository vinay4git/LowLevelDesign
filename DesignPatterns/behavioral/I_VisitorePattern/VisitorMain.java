package DesignPatterns.behavioral.I_VisitorePattern;

import DesignPatterns.behavioral.I_VisitorePattern.Room.DeluxeRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.LuxuryRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.SingleRoom;
import DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation.PricingVisitor;

public class VisitorMain {
    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom();
        DeluxeRoom deluxeRoom = new DeluxeRoom();
        LuxuryRoom luxuryRoom = new LuxuryRoom();

        PricingVisitor pricingVisitor = new PricingVisitor();

        singleRoom.accept(pricingVisitor);
        System.out.println(singleRoom.getPrice());

        deluxeRoom.accept(pricingVisitor);
        System.out.println(deluxeRoom.getPrice());
    }
}
