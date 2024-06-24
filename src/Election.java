import java.util.ArrayList;
import java.util.List;

public class Election {

    // Attribute
    private List<Candidate> candidates;

    // Constructor
    public Election() {
        candidates = new ArrayList<>();
    }

    // Methods
    public void addCandidate(Candidate candidate) {
        if (candidate != null) {
            candidates.add(candidate);
        }
    }

    public int getTotalVotes() {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getNumberOfVotes();
        }
        return totalVotes;
    }

    public List<Candidate> getCandidatesFromParty(String party) {
        List<Candidate> candidatesFromParty = new ArrayList<>();
        if (party == null) {
            return candidatesFromParty;
        }
        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party)) {
                candidatesFromParty.add(candidate);
            }
        }
        return candidatesFromParty;
    }
}
