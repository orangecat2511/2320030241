package observer;

class ConcreteSubject extends Subject {
           public void startAuction() {
        	   System.out.println("Auction Started");
           }
           public void endAuction() {
        	   System.out.println("Auction Ended");
           }
           public void itemAvailable(String itemName) {
               System.out.println("Item available: " + itemName);
               notifyObserver(new AuctionSystem("ITEM_AVAILABLE", "Item " + itemName + " is now available for bidding."));
           }
}
