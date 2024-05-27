import java.util.StringJoiner;

public class Name {

    // Attributes
    private String firstName;
    private String lastName;
    private String[] middleNames;

    // Constructor
    public Name(String fullName) {
        if (fullName == null) {
            throw new NullPointerException("Full was null and must not be null.");
        }
        String[] names = fullName.split(" ");
        if (names.length < 2) {
            throw new IllegalArgumentException("Must have at least two names separated by a space character.");
        }
        firstName = names[0];
        lastName = names[names.length - 1];
        if (names.length > 2) {
            middleNames = new String[names.length - 2];
            for (int i = 0; i < middleNames.length; i++) {
                middleNames[i] = names[i + 1];
            }
        }
    }

    // Object method
    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" ");
        sj.add(firstName);
        if (middleNames != null) {
            for (String middleName : middleNames) {
                sj.add(middleName);
            }
        }
        sj.add(lastName);
        return sj.toString();
    }
}