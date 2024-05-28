public class BMI {

    // Attributes
    private int cmHeight;
    private int kgWeight;

    // Constructor
    public BMI(int cmHeight, int kgWeight) {
        if (cmHeight < 1 || kgWeight < 1) {
            throw new IllegalArgumentException("Height and weight must be positive.");
        }
        this.cmHeight = cmHeight;
        this.kgWeight = kgWeight;
    }

    // Methods
    public double calculate() {
        return kgWeight / Math.pow(cmHeight / 100.0, 2);
    }

    public boolean isUnderweight() {
        return calculate() < 18.5;
    }

    public boolean isOverweight() {
        return calculate() > 25;
    }

    public boolean isNormalWeight() {
        return !isUnderweight() && !isOverweight();
    }
}