public class Trailer {

    // Attribute
    private double kgVægt;

    // Constructor
    public Trailer(double kgVægt) {
        if (kgVægt <= 0) {
            throw new IllegalArgumentException("Vægt skal være positiv.");
        }
        this.kgVægt = kgVægt;
    }

    // Getter
    public double getKgVægt() {
        return kgVægt;
    }
}