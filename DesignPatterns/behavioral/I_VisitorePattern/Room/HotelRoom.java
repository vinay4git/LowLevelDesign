package DesignPatterns.behavioral.I_VisitorePattern.Room;

import DesignPatterns.behavioral.I_VisitorePattern.VisitorOperation.Visitor;

public abstract class HotelRoom {
    int price;
    public abstract void accept(Visitor visitor);

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
