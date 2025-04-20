package DesignPatterns.behavioral.H_MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionManager{
    List<Participant> bidders;
    int currentBidAmount;
    public Auction(int currentBidAmount) {
        this.bidders = new ArrayList<>();
        this.currentBidAmount = currentBidAmount;
    }

    @Override
    public void addBidder(Participant b) {
        bidders.add(b);
    }

    @Override
    public void placeBid(Participant sender, int bidAmount) {
        if (currentBidAmount > bidAmount) {
            sender.invalidBid(bidAmount);
        }else {
            for (Participant p : bidders) {
                if (p != sender){
                    p.receiveBidNotification(bidAmount);
                }
                this.currentBidAmount = bidAmount;
            }
        }
    }
}
