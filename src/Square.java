public class Square implements Shape {

    // Attribute
    private double width;

    // Constructor
    public Square(double width) {
        this.width = width;
    }

    // Shape method
    @Override
    public double getArea() {
        return width * width;
    }
}