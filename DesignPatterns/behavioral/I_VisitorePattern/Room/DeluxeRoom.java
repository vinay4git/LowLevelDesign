package DesignPatterns.behavioral.I_VisitorePattern.Room;

import DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation.Visitor;

public class DeluxeRoom extends HotelRoom{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
