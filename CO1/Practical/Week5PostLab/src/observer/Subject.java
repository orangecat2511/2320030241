package observer;

public abstract class Subject {
	private Observer bidder;

    public void setBidder(Observer bidder) {
        this.bidder = bidder;
    }

    protected void notifyObserver(AuctionSystem event) {
        if (bidder != null) {
            bidder.update(event);
        }

}

public abstract void startAuction();

public abstract void endAuction();
}