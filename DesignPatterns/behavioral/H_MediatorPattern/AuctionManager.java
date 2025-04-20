package DesignPatterns.behavioral.H_MediatorPattern;

public interface AuctionManager {
    void addBidder(Participant b);
    void placeBid(Participant sender, int bidAmount);
}
