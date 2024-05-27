import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Keyword {

    // Attributes
    private String name;
    private String definition;
    private List<Keyword> seeAlso;

    // Constructor
    public Keyword(String word, String definition) {
        this.name = word;
        this.definition = definition;
        seeAlso = new ArrayList<>();
    }

    // Methods
    public boolean matches(String searchWord) {
        return name.toLowerCase().contains(searchWord.toLowerCase());
    }

    public void addToSeeAlso(Keyword... keywords) {
        seeAlso.addAll(List.of(keywords));
    }

    // Object method
    @Override
    public String toString() {
        /*
        // Funktionel
        return name + "\n  Definition: " + definition + (seeAlso.isEmpty() ? "" : "\n  See also: " + seeAlso.stream()
                .map(keyword -> keyword.name)
                .collect(Collectors.joining(", "))
        );
        */
        // Imperativ
        StringJoiner sj = new StringJoiner(", ");
        for (Keyword keyword : seeAlso) {
            sj.add(keyword.name);
        }
        return name + "\n  Definition: " + definition + (seeAlso.isEmpty() ? "" : "\n  See also: " + sj);
    }
}