package DesignPatterns.behavioral.H_MediatorPattern;

public interface Participant {
    void receiveBidNotification(int bidAmount);
    void placeBid(int bidAmount);
    String getName(String name);
    void invalidBid(int bidAmount);
}
