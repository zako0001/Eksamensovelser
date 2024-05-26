import java.time.LocalDate;

public class Film {

    // Attributes
    private String filmtitel;
    private int udgivelsesår;
    private Producer producer;

    // Constructors
    public Film(String filmtitel, int udgivelsesår) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }

    public Film(String filmtitel) {
        this.filmtitel = filmtitel;
        udgivelsesår = LocalDate.now().getYear();
    }

    // Setter
    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    // Getter (ikke nødvendig)
    public int getUdgivelsesår() {
        return udgivelsesår;
    }
}