package DesignPatterns.behavioral.I_VisitorePattern.Room;

import DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation.Visitor;

public class DeluxeRoom implements HotelRoom{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
