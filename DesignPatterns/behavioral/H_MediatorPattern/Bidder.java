package DesignPatterns.behavioral.H_MediatorPattern;


public class Bidder implements Participant{
    AuctionManager auctionManager;
    String name;

    public Bidder(AuctionManager auctionManager, String name) {
        this.auctionManager = auctionManager;
        this.name = name;
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Updated bid Amount " + bidAmount + " notify to Bidder: "  + getName());
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionManager.placeBid(this, bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void invalidBid(int bidAmount) {
        System.out.println("Invalid bid Amount " + bidAmount + " notify to Bidder: "  + getName());
    }
}
