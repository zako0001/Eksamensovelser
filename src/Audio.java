public class Audio extends Media {

    // Attribute
    private double loudness;

    // Constructor
    public Audio(String name, double duration, double loudness) {
        super(name, duration);
        this.loudness = loudness;
    }

    // Getter
    public double getLoudness() {
        return loudness;
    }
}