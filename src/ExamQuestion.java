import java.util.Random;

public class ExamQuestion {

    // Attributes
    private static int nextNumber = 1;
    private int number;
    private char grade;

    // Constructor
    public ExamQuestion() {
        number = nextNumber++;
        setGradeToRandom();
    }

    // Object method
    @Override
    public String toString() {
        return "(" + number + ", " + grade + ")";
    }

    // Auxiliary method
    private void setGradeToRandom() {
        String grades = "ABCDEF";
        grade = grades.charAt(new Random().nextInt(grades.length()));
    }
}