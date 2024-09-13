package singleton1;

public class LoginManager {

	    private static LoginManager instance;

	    // The state of the user's login
	    private boolean isLoggedIn;
	    private String loggedInUser;

	    // Private constructor to prevent instantiation
	    private LoginManager() {
	        this.isLoggedIn = false;
	        this.loggedInUser = null;
	    }

	    // Public method to provide access to the single instance
	    public static synchronized LoginManager getInstance() {
	        if (instance == null) {
	            instance = new LoginManager();
	        }
	        return instance;
	    }

	    // Method to log in the user
	    public void login(String username) {
	        if (!isLoggedIn) {
	            this.isLoggedIn = true;
	            this.loggedInUser = username;
	            System.out.println(username + " logged in successfully.");
	        } else {
	            System.out.println("Another user is already logged in.");
	        }
	    }

	    // Method to log out the user
	    public void logout() {
	        if (isLoggedIn) {
	            System.out.println(loggedInUser + " logged out successfully.");
	            this.isLoggedIn = false;
	            this.loggedInUser = null;
	        } else {
	            System.out.println("No user is logged in.");
	        }
	    }

	    // Check if a user is logged in
	    public boolean isLoggedIn() {
	        return isLoggedIn;
	    }

	    // Get the currently logged-in user's name
	    public String getLoggedInUser() {
	        return loggedInUser;
	    }
	}