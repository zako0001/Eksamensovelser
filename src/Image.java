public class Image {

    // Attributes
    private String fileName;
    private int width;
    private int height;

    // Constructor
    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    // Methods
    public boolean isKnownFileType() {
        String[] knownFileTypes = {"gif", "jpg", "jpeg", "png", "webp", "bmp"};
        for (String fileType : knownFileTypes) {
            if (fileName.endsWith("." + fileType)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPortrait() {
        return width < height;
    }

    public boolean isLandscape() {
        return width > height;
    }
}