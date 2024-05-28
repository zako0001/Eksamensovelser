import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Tekst {

    // Attribute
    private List<String> tekstLinjer;

    // Constructor
    public Tekst() {
        tekstLinjer = new ArrayList<>();
    }

    // Methods
    public void tilføj(String tekstLinje) {
        if (tekstLinje == null) {
            throw new NullPointerException("tekstLinje var null og må ikke være null.");
        }
        tekstLinjer.add(tekstLinje);
    }

    public int findAntalUnikke1() {
        // Brug af Set
        return new HashSet<>(tekstLinjer).size();
    }

    public int findAntalUnikke2() {
        // Uden brug af Set
        List<String> unikkeTekstLinjer = new ArrayList<>();
        for (String tekstLinje : tekstLinjer) {
            if (!unikkeTekstLinjer.contains(tekstLinje)) {
                unikkeTekstLinjer.add(tekstLinje);
            }
        }
        return unikkeTekstLinjer.size();
    }
}