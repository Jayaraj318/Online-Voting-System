import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ElectionManager {
    private Map<String, Candidate> candidates;
    private Map<String, Voter> voters;

    public ElectionManager() {
        candidates = new HashMap<>();
        voters = new HashMap<>();
    }

    public void addCandidate(String candidateId, String candidateName) {
        candidates.put(candidateId, new Candidate(candidateId, candidateName));
    }

    public void registerVoter(String voterId, String voterName) {
        voters.put(voterId, new Voter(voterId, voterName));
    }

    public void castVote(String voterId, String candidateId) {
        // ... (unchanged)
    }

    public void displayVoters(String voterId) {
        // ... (unchanged)
    }

    public void displayResults() {
        // ... (unchanged)
    }
}

class Candidate {
    // ... (unchanged)
}

class Voter {
    // ... (unchanged)
}

public class Voters {
    public static void main(String[] args) {
        ElectionManager electionManager = new ElectionManager();
        Scanner scanner = new Scanner(System.in);

        // Add candidates
        electionManager.addCandidate("1", "ALAN YT");
        electionManager.addCandidate("2", "SWEETY");
        electionManager.addCandidate("3", "MR BLACK");
        electionManager.addCandidate("4", "TFG SINGAM");

        // Register voters
        for (int i = 1; i <= 56; i++) {
            System.out.print("Enter voter ID for voter " + i + ": ");
            String voterId = scanner.nextLine();
            System.out.print("Enter voter name for voter " + i + ": ");
            String voterName = scanner.nextLine();
            electionManager.registerVoter(voterId, voterName);
        }

        // User interface
        while (true) {
            // ... (unchanged)
        }
    }
}
