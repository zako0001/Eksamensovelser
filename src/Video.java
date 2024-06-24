public class Video extends Media {

    // Attribute
    private String aspectRatio;

    // Constructor
    public Video(String name, double duration, int width, int height) {
        super(name, duration);
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height must both be positive.");
        }
        aspectRatio = width + ":" + height;
    }

    // Getter
    public String getAspectRatio() {
        return aspectRatio;
    }
}