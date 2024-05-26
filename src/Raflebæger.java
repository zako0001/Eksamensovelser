import java.util.Random;

public class Raflebæger {

    // Attribute
    private int[] terninger;

    // Constructor
    public Raflebæger(int antalTerninger) {
        if (antalTerninger < 1) {
            throw new IllegalArgumentException("Antal terninger skal være mindst 1.");
        }
        terninger = new int[antalTerninger];
    }

    // Methods
    public int ryst() {
        int sum = 0;
        for (int i = 0; i < terninger.length; i++) {
            terninger[i] = new Random().nextInt(6) + 1;
            sum += terninger[i];
        }
        return sum;
    }

    public int[] se() {
        if (terninger[0] == 0) {
            throw new IllegalStateException("Bægeret skal være rystet mindst 1 gang.");
        }
        return terninger.clone();
    }
}