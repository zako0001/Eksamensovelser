import java.util.Random;

public class User1 {

    // Attributes
    private String fullName;
    private String userID;

    // Constructor
    public User1(String fullName) {
        this.fullName = fullName;
        try {
            createUserID();
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Invalid full name.");
        }
    }

    // Method
    public boolean validUserID() {
        if (userID == null || userID.length() != 8) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (!Character.isLowerCase(userID.charAt(i))) {
                return false;
            }
        }
        for (int i = 4; i < 8; i++) {
            if (!Character.isDigit(userID.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Auxiliary method
    private void createUserID() {
        String[] names = fullName.toLowerCase().split(" ");
        userID = names[0].substring(0, 2) + names[names.length - 1].substring(0, 2) + new Random().nextInt(1000, 10000);
    }
}
