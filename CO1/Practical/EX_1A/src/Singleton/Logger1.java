package Singleton;

public class Logger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger1=Logger.getInstance();
		logger1.log("This is logging in");
		System.out.println("Message" +logger1);
	}

}
