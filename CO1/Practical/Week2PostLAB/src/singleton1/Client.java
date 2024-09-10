package singleton1;

public class Client {

 public static void main(String[] args) {
     LoginManager loginManager = LoginManager.getInstance();

     BankingOperations operations = new BankingOperations();
     operations.viewBalance();
     operations.deposit(500);
     operations.withdraw(200);

     // Log in and perform operations
     loginManager.login("JohnDoe");
     operations.viewBalance();
     operations.deposit(500);
     operations.withdraw(200);

     // Log out and try to perform operations again
     loginManager.logout();
     operations.viewBalance();
 }
}
