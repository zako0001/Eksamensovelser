import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Comparator;

public class Dream {

    // Nested class
    public enum Type {PROBLEM_SOLVING, NEUTRAL, NIGHTMARE}

    // Public property
    public static Comparator<Dream> DATE_ORDER = Comparator.comparing(Dream::getDate);

    // Attributes
    private LocalDate date;
    private double durationInMinutes;
    private Type type;

    // Constructor
    public Dream(int dayOfMonth, int month, int year, double durationInMinutes, Type type) {
        try {
            date = LocalDate.of(year, month, dayOfMonth);
        } catch (DateTimeException dte) {
            throw new IllegalArgumentException("Invalid day of month, month, or year.");
        }
        if (durationInMinutes < 0) {
            throw new IllegalArgumentException("Duration in minutes must be positive.");
        }
        this.durationInMinutes = durationInMinutes;
        if (type == null) {
            throw new IllegalArgumentException("Type was null.");
        }
        this.type = type;
    }

    // Getter
    private LocalDate getDate() {
        return date;
    }

    // Method
    public boolean isPleasant() {
        return
            type == Type.PROBLEM_SOLVING && durationInMinutes < 10.0 ||
            type == Type.NEUTRAL && durationInMinutes > 10.0;
    }
}
