import java.util.Comparator;
import java.util.List;

public class HogwartsStudent {

    // Attributes
    private String firstName;
    private String lastName;
    private String house;

    // Static property
    public static final Comparator<HogwartsStudent> LAST_NAME_ORDER = Comparator.comparing(HogwartsStudent::getLastName, String.CASE_INSENSITIVE_ORDER);

    // Constructor
    public HogwartsStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Setter
    public void setHouse(String house) {
        List<String> houses = List.of("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin");
        if (!houses.contains(house)) {
            throw new IllegalArgumentException("Invalid house.");
        }
        this.house = house;
    }

    // Getter
    public String getLastName() {
        return lastName;
    }
}