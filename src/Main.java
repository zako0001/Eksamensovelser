import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Test af Tekst
        Tekst tekst = new Tekst();
        tekst.tilføj("nul");
        tekst.tilføj("nul");
        tekst.tilføj("to");
        tekst.tilføj("tre");
        boolean assertion1 = 3 == tekst.findAntalUnikke1() && 3 == tekst.findAntalUnikke2();
        System.out.println("Tekst virker:                   " + assertion1);

        // Test af Film & Producer
        Film film1 = new Film("Avatar", 2009);
        film1.setProducer(new Producer());
        Film film2 = new Film("Mean Girls");
        boolean assertion2 = 2024 == film2.getUdgivelsesår();
        System.out.println("Film & Producer virker:         " + assertion2);

        // Test af Raflebæger
        Raflebæger raflebæger = new Raflebæger(5);
        int samledeAntalØjne = raflebæger.ryst();
        int sum = 0;
        for (int terning : raflebæger.se()) {
            sum += terning;
        }
        boolean assertion3 = 5 <= samledeAntalØjne && samledeAntalØjne == sum;
        System.out.println("Raflebæger virker:              " + assertion3);

        // Test af Keyword
        Keyword keyword = new Keyword("syv", "Tallet mellem seks og otte.");
        keyword.addToSeeAlso(new Keyword("seks", "Tallet mellem fem og syv"), new Keyword("otte", "Tallet mellem syv og ni"));
        boolean assertion4 = keyword.matches("yV");
        System.out.println("Keyword virker:                 " + assertion4);

        // Test af Card
        Card card1 = new Card(Card.Suit.HEARTS, 5);
        Card card2 = new Card(Card.Suit.SPADES, 3);
        Card card3 = new Card(Card.Suit.CLUBS, 5);
        boolean assertion5 = card1.beats(card2) && card1.beats(card3);
        System.out.println("Card virker:                    " + assertion5);

        // Test af Bil & Trailer
        Bil bil = new Bil(1000.0);
        double vægtUdenTrailer = bil.kgTotalVægt();
        Trailer trailer = new Trailer(500.0);
        bil.tilkoblTrailer(trailer);
        boolean assertion6 = bil.kgTotalVægt() - vægtUdenTrailer == trailer.getKgVægt();
        System.out.println("Bil & Trailer virker:           " + assertion6);

        // Test af Name
        String nameString1 = "Anna Delvey";
        String nameString2 = "Tom Marvolo Riddle";
        String nameString3 = "Fornavn To Tre Efternavn";
        Name nameObject1 = new Name(nameString1);
        Name nameObject2 = new Name(nameString2);
        Name nameObject3 = new Name(nameString3);
        boolean assertion7 = nameString1.equals(nameObject1.toString()) && nameString2.equals(nameObject2.toString()) && nameString3.equals(nameObject3.toString());
        System.out.println("Name virker:                    " + assertion7);

        // Test af DateAgeCalculatior
        DateAgeCalculator dac1 = new DateAgeCalculator(40, 18);
        DateAgeCalculator dac2 = new DateAgeCalculator(25, 25);
        boolean assertion8 = dac1.dateIsTooYoung() && !dac2.dateIsTooYoung();
        System.out.println("DateAgeCalculator virker:       " + assertion8);

        // Test af Motherboard og SataDrive
        Motherboard motherboard = new Motherboard();
        boolean assertion9 =
            motherboard.connectSataDrive(new SataDrive())
            && motherboard.connectSataDrive(new SataDrive())
            && motherboard.connectSataDrive(new SataDrive())
            && motherboard.connectSataDrive(new SataDrive())
            && !motherboard.connectSataDrive(new SataDrive());
        System.out.println("Motherboard & SataDrive virker: " + assertion9);

        // Test af BMI
        BMI undervægtig = new BMI(182, 60);
        BMI overvægtig = new BMI(182, 90);
        BMI normalvægtig = new BMI(182, 75);
        boolean assertion10 =
            undervægtig.isUnderweight() && !undervægtig.isOverweight() && !undervægtig.isNormalWeight() &&
            !overvægtig.isUnderweight() && overvægtig.isOverweight() && !overvægtig.isNormalWeight() &&
            !normalvægtig.isUnderweight() && !normalvægtig.isOverweight() && normalvægtig.isNormalWeight();
        System.out.println("BMI virker:                     " + assertion10);

        // Test af Article
        Article article = new Article(
            "En overskrift",
            "Denne tekst er skrevet med det formål at være lang. En lang tekst er en tekst med mange ord. At teksten har mange ord, gør, at teksten også har mange tegn; det er sgu vigtigt for en tekst, der skal være så lang som muligt. \"Reservedel\" er et langt ord.",
            "Zacharias Koefoed"
        );
        boolean assertion11 = article.getLongestWord1().length() == 10 && article.getLongestWord2().length() == 10;
        System.out.println("Article virker:                 " + assertion11);

        // Test af User
        User user = new User("Zacharias Koefoed");
        boolean assertion12 = user.validUserID();
        System.out.println("User virker:                    " + assertion12);
    }
}