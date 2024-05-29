public class Circle implements Shape {

    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Shape method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}