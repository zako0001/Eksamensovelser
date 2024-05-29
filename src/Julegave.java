import java.util.Random;

public class Julegave {

    // Attributes
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    // Constructor
    public Julegave() {
        Random random = new Random();
        isSoft = random.nextBoolean();
        isRectangular = random.nextBoolean();
        doesRattle = random.nextBoolean();
    }

    // Method
    public boolean couldBeLego() {
        return !isSoft && isRectangular && doesRattle;
    }
}