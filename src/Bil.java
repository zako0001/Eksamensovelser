public class Bil {

    // Attributes
    private double kgVægt;
    private Trailer trailer;

    // Constructor
    public Bil(double kgVægt) {
        if (kgVægt <= 0) {
            throw new IllegalArgumentException("Vægt skal være positiv.");
        }
        this.kgVægt = kgVægt;
    }

    // Methods
    public double kgTotalVægt() {
        return kgVægt + (trailer != null ? trailer.getKgVægt() : 0);
    }

    public boolean tilkoblTrailer(Trailer trailer) {
        if (trailer != null && kgVægt + trailer.getKgVægt() <= 3500) {
            this.trailer = trailer;
            return true;
        }
        return false;
    }
}