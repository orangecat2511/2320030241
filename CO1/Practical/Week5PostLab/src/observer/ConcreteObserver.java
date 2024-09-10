package observer;

class ConcreteObserver implements Observer {
	 private String name;

	    public ConcreteObserver(String name) {
	        this.name = name;
	    }

	    public void update(AuctionSystem event) {
	        System.out.println("Bidder " + name + " received event: " + event.getMessage());
	    }
}
