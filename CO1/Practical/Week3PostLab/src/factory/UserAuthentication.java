package factory;

//UserAuthentication.java (Singleton)
class UserAuthentication {
 private static UserAuthentication instance;
 private String authenticatedUser;

 // Private constructor to prevent instantiation
 private UserAuthentication() {
 }

 // Public method to provide access to the single instance
 public static synchronized UserAuthentication getInstance() {
     if (instance == null) {
         instance = new UserAuthentication();
     }
     return instance;
 }

 // Method to log in the user
 public void login(String username) {
     if (authenticatedUser == null) {
         authenticatedUser = username;
         System.out.println(username + " logged in successfully.");
     } else {
         System.out.println("User " + authenticatedUser + " is already logged in.");
     }
 }

 // Method to log out the user
 public void logout() {
     if (authenticatedUser != null) {
         System.out.println(authenticatedUser + " logged out successfully.");
         authenticatedUser = null;
     } else {
         System.out.println("No user is logged in.");
     }
 }

 // Method to get the logged-in user
 public String getAuthenticatedUser() {
     return authenticatedUser;
 }
}
