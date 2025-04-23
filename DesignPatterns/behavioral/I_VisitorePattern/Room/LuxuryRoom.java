package DesignPatterns.behavioral.I_VisitorePattern.Room;

import DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation.Visitor;

public class LuxuryRoom implements HotelRoom{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
