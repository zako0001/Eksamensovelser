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
        // Simpel metode, der benytter noget, vi ikke har lært om.
        return new HashSet<>(tekstLinjer).size();
    }

    public int findAntalUnikke2() {
        // Længere metode, der ikke benytter noget, vi ikke har lært om.
        List<String> unikkeTekstLinjer = new ArrayList<>();
        for (String tekstLinje : tekstLinjer) {
            if (!unikkeTekstLinjer.contains(tekstLinje)) {
                unikkeTekstLinjer.add(tekstLinje);
            }
        }
        return unikkeTekstLinjer.size();
    }
}