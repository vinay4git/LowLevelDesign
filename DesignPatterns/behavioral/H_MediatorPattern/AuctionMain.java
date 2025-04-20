package DesignPatterns.behavioral.H_MediatorPattern;

public class AuctionMain {
    public static void main(String[] args) {
        Auction auction = new Auction(100);

        Bidder salim = new Bidder(auction, "salim");
        auction.addBidder(salim);

        Bidder anar = new Bidder(auction, "anar");
        auction.addBidder(anar);

        Bidder abdulla = new Bidder(auction, "abdulla");
        auction.addBidder(abdulla);

        salim.placeBid(101);

        anar.placeBid(100);
    }
}
