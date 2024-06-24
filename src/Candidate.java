public class Candidate {

    // Attributes
    private String name;
    private String party;
    private int numberOfVotes;

    // Constructor
    public Candidate(String name, String party, int numberOfVotes) {
        if (numberOfVotes < 0) {
            throw new IllegalArgumentException("Number of votes must be positive.");
        }
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public String getParty() {
        return party;
    }
}