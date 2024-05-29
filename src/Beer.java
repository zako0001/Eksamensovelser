public class Beer {

    // Attributes
    private String name;
    private double alcoholPercentage;
    private int price;


    // Constructor
    public Beer(String name) {
        this.name = name;
    }

    // Setters
    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage < 0 || alcoholPercentage > 100) {
            throw new IllegalArgumentException("Invalid alcohol percentage");
        }
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Invalid price.");
        }
        this.price = price;
    }

    // Getter
    public int getPrice() {
        return price;
    }
}