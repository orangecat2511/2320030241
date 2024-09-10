package ridesharring;

public class User {
		private static User instance;
	    private String currentUser;

	    private User() {
	       
	    }

	    public static synchronized User getInstance() {
	        if (instance == null) {
	            instance = new User();
	        }
	        return instance;
	    }

	    public void login(String user) {
	        currentUser = user;
	        System.out.println(user + " logged in.");
	    }

	    public void logout() {
	        System.out.println(currentUser + " logged out.");
	        currentUser = null;
	    }

	    public String getCurrentUser() {
	        return currentUser;
	    }

	}

