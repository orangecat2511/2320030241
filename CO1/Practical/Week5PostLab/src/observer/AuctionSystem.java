package observer;

public class AuctionSystem {
	    private String eventType;
	    private String message;

	    public AuctionSystem(String eventType, String message) {
	        this.eventType = eventType;
	        this.message = message;
	    }

	    public String getEventType() {
	        return eventType;
	    }

	    public String getMessage() {
	        return message;
	    }
	}

