public class Main {
    public static void main(String[] args) {

        // Test af Tekst
        Tekst tekst = new Tekst();
        tekst.tilføj("nul");
        tekst.tilføj("nul");
        tekst.tilføj("to");
        tekst.tilføj("tre");
        boolean assertion1 = 3 == tekst.findAntalUnikke1() && 3 == tekst.findAntalUnikke2();
        System.out.println("Tekst virker:           " + assertion1);

        // Test af Film & Producer
        Film film1 = new Film("Avatar", 2009);
        film1.setProducer(new Producer());
        Film film2 = new Film("Mean Girls");
        boolean assertion2 = 2024 == film2.getUdgivelsesår();
        System.out.println("Film & Producer virker: " + assertion2);

        // Test af Raflebæger
        Raflebæger raflebæger = new Raflebæger(5);
        int samledeAntalØjne = raflebæger.ryst();
        int sum = 0;
        for (int terning : raflebæger.se()) {
            sum += terning;
        }
        boolean assertion3 = 5 <= samledeAntalØjne && samledeAntalØjne == sum;
        System.out.println("Raflebæger virker:      " + assertion3);

        // Test af Keyword
        Keyword keyword = new Keyword("syv", "Tallet mellem seks og otte.");
        keyword.addToSeeAlso(new Keyword("seks", "Tallet mellem fem og syv"), new Keyword("otte", "Tallet mellem syv og ni"));
        boolean assertion4 = keyword.matches("yV");
        System.out.println("Keyword virker:         " + assertion4);

        // Test af Card
        Card card1 = new Card(Card.Suit.HEARTS, 5);
        Card card2 = new Card(Card.Suit.SPADES, 3);
        Card card3 = new Card(Card.Suit.CLUBS, 5);
        boolean assertion5 = card1.beats(card2) && card1.beats(card3);
        System.out.println("Card virker:            " + assertion5);

        // Test af Bil & Trailer
        Bil bil = new Bil(1000.0);
        double vægtUdenTrailer = bil.kgTotalVægt();
        Trailer trailer = new Trailer(500.0);
        bil.tilkoblTrailer(trailer);
        boolean assertion6 = bil.kgTotalVægt() - vægtUdenTrailer == trailer.getKgVægt();
        System.out.println("Bil & Trailer virker:   " + assertion6);
    }
}