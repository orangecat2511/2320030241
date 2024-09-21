package voting;
import java.util.*;

public class Main {
		 public static void main(String[] args) {
		        VotingSystem votingSystem = new VotingSystem();
		        Scanner scanner = new Scanner(System.in);
		        
		        votingSystem.addCandidate("Candidate 1");
		        votingSystem.addCandidate("Candidate 2");
		        votingSystem.addCandidate("Candidate 3");
		     
		        System.out.println("Names of candidates participating:");
		        System.out.println("Candidate 1");
		        System.out.println("Candidate 2");
		        System.out.println("Candidate 3");
		        
		        while (true) {
		            System.out.println("Enter your voter ID (or type 'exit' to stop voting):");
		            String voterID = scanner.nextLine();
		            if (voterID.equalsIgnoreCase("exit")) {
		                break;
		            }

		            System.out.println("Enter the candidate you want to vote for:");
		            String candidate = scanner.nextLine();
		            
		            if (votingSystem.vote(voterID, candidate)) {
		                System.out.println("Vote recorded successfully.");
		            } else {
		                System.out.println("Invalid vote. Either you've already voted or the candidate doesn't exist.");
		            }
		        }
		        votingSystem.printResults();
		        scanner.close();
		    }

}
