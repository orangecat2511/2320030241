package singleton1;

public class BankingOperations {
	    public void viewBalance() {
	        LoginManager loginManager = LoginManager.getInstance();
	        if (loginManager.isLoggedIn()) {
	            System.out.println("Displaying balance for " + loginManager.getLoggedInUser());
	           
	        } else {
	            System.out.println("Please log in to view your balance.");
	        }
	    }

	    public void deposit(double amount) {
	        LoginManager loginManager = LoginManager.getInstance();
	        if (loginManager.isLoggedIn()) {
	            System.out.println("Depositing " + amount + " for " + loginManager.getLoggedInUser());
	            // Logic to deposit amount
	        } else {
	            System.out.println("Please log in to deposit funds.");
	        }
	    }

	    public void withdraw(double amount) {
	        LoginManager loginManager = LoginManager.getInstance();
	        if (loginManager.isLoggedIn()) {
	            System.out.println("Withdrawing " + amount + " for " + loginManager.getLoggedInUser());
	            // Logic to withdraw amount
	        } else {
	            System.out.println("Please log in to withdraw funds.");
	        }
	    }
	}

