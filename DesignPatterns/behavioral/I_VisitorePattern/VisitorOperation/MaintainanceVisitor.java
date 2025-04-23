package DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation;

import DesignPatterns.behavioral.I_VisitorePattern.Room.DeluxeRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.LuxuryRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.SingleRoom;

public class MaintainanceVisitor implements Visitor{

    public void visit(SingleRoom hotelRoom) {

    }

    @Override
    public void visit(DeluxeRoom hotelRoom) {

    }

    @Override
    public void visit(LuxuryRoom hotelRoom) {

    }
}
