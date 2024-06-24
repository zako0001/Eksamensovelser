public abstract class Media {

    // Attributes
    private String name;
    private double duration;

    // Constructor
    public Media(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }
}
