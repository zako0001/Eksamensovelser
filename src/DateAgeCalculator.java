public class DateAgeCalculator {

    // Attributes
    private int yourAge;
    private int dateAge;

    // Constructor
    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    // Method
    public int lowestAcceptableDateAge() {
        return (int) Math.round(yourAge / 2.0) + 7;
    }

    public boolean dateIsTooYoung() {
        return dateAge < lowestAcceptableDateAge();
    }
}