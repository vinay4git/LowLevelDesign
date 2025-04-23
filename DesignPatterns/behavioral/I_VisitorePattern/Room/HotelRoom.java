package DesignPatterns.behavioral.I_VisitorePattern.Room;

import DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation.Visitor;

public interface HotelRoom {
    void accept(Visitor visitor);
}
