package observer;

public class Client {

	public static void main(String[] args) {
     Subject subject=new ConcreteSubject();
     Observer observer=new ConcreteObserver("JaneDoe");
     
     subject.setBidder(observer);
     subject.startAuction();
     ((ConcreteSubject)subject).itemAvailable("LastSupper");
     subject.endAuction();
	}

}
