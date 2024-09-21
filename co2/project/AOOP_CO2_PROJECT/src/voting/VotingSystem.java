package voting;


import java.util.*;

public class VotingSystem {
      private Set<String> voters;
      private Map<String,Integer> candidates;
      
      public VotingSystem() {
    	  voters= new HashSet<>();
    	  candidates = new HashMap<>();
      }
      public void addCandidate(String candidate) {
          candidates.putIfAbsent(candidate, 0); 
      }
      public boolean vote(String voterID, String candidate) {
    	    if (voters.contains(voterID)) {
    	        System.out.println("Error: You have already voted.");
    	        return false;
    	    }
    	    if (candidates.containsKey(candidate)) {
    	        voters.add(voterID);
    	        candidates.put(candidate, candidates.get(candidate) + 1);
    	        return true;
    	    }
    	    System.out.println("Error: Candidate does not exist.");
    	    return false;
    	}
      public int getVotes(String candidate) {
          return candidates.getOrDefault(candidate, 0);
      }
      public void printResults() {
          System.out.println("Voting Results:");
          for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
              System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
          }
}
}
