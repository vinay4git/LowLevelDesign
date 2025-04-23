package DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation;

import DesignPatterns.behavioral.I_VisitorePattern.Room.DeluxeRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.LuxuryRoom;
import DesignPatterns.behavioral.I_VisitorePattern.Room.SingleRoom;

public interface Visitor {
    void visit(SingleRoom hotelRoom);
    void visit(DeluxeRoom hotelRoom);
    void visit(LuxuryRoom hotelRoom);
}
