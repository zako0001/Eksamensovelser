import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Test af Tekst (øvelse 1)
        Tekst tekst = new Tekst();
        tekst.tilføj("nul");
        tekst.tilføj("nul");
        tekst.tilføj("to");
        tekst.tilføj("tre");
        boolean assertion1 = 3 == tekst.findAntalUnikke1() && 3 == tekst.findAntalUnikke2();
        System.out.println("Tekst virker:                   " + assertion1);

        // Test af Film & Producer (øvelse 2)
        Film film1 = new Film("Avatar", 2009);
        film1.setProducer(new Producer());
        Film film2 = new Film("Mean Girls");
        boolean assertion2 = 2024 == film2.getUdgivelsesår();
        System.out.println("Film & Producer virker:         " + assertion2);

        // Test af Raflebæger (øvelse 3)
        Raflebæger raflebæger = new Raflebæger(5);
        int samledeAntalØjne = raflebæger.ryst();
        int sum1 = 0;
        for (int terning : raflebæger.se()) {
            sum1 += terning;
        }
        boolean assertion3 = 5 <= samledeAntalØjne && samledeAntalØjne == sum1;
        System.out.println("Raflebæger virker:              " + assertion3);

        // Test af Keyword (øvelse 4)
        Keyword keyword = new Keyword("syv", "Tallet mellem seks og otte.");
        keyword.addToSeeAlso(new Keyword("seks", "Tallet mellem fem og syv"), new Keyword("otte", "Tallet mellem syv og ni"));
        boolean assertion4 = keyword.matches("yV");
        System.out.println("Keyword virker:                 " + assertion4);

        // Test af Card (øvelse 5)
        Card card1 = new Card(Card.Suit.HEARTS, 5);
        Card card2 = new Card(Card.Suit.SPADES, 3);
        Card card3 = new Card(Card.Suit.CLUBS, 5);
        boolean assertion5 = card1.beats(card2) && card1.beats(card3);
        System.out.println("Card virker:                    " + assertion5);

        // Test af Bil & Trailer (øvelse 6)
        Bil bil = new Bil(1000.0);
        double vægtUdenTrailer = bil.kgTotalVægt();
        Trailer trailer = new Trailer(500.0);
        bil.tilkoblTrailer(trailer);
        boolean assertion6 = bil.kgTotalVægt() - vægtUdenTrailer == trailer.getKgVægt();
        System.out.println("Bil & Trailer virker:           " + assertion6);

        // Test af Name (øvelse 7)
        String nameString1 = "Anna Delvey";
        String nameString2 = "Tom Marvolo Riddle";
        String nameString3 = "Fornavn To Tre Efternavn";
        Name nameObject1 = new Name(nameString1);
        Name nameObject2 = new Name(nameString2);
        Name nameObject3 = new Name(nameString3);
        boolean assertion7 = nameString1.equals(nameObject1.toString()) && nameString2.equals(nameObject2.toString()) && nameString3.equals(nameObject3.toString());
        System.out.println("Name virker:                    " + assertion7);

        // Test af DateAgeCalculatior (øvelse 8)
        DateAgeCalculator dac1 = new DateAgeCalculator(40, 18);
        DateAgeCalculator dac2 = new DateAgeCalculator(25, 25);
        boolean assertion8 = dac1.dateIsTooYoung() && !dac2.dateIsTooYoung();
        System.out.println("DateAgeCalculator virker:       " + assertion8);

        // Test af Motherboard og SataDrive (øvelse 9)
        Motherboard motherboard = new Motherboard();
        boolean assertion9 =
            motherboard.connectSataDrive(new SataDrive())
            && motherboard.connectSataDrive(new SataDrive())
            && motherboard.connectSataDrive(new SataDrive())
            && motherboard.connectSataDrive(new SataDrive())
            && !motherboard.connectSataDrive(new SataDrive());
        System.out.println("Motherboard & SataDrive virker: " + assertion9);

        // Test af BMI (øvelse 10)
        BMI undervægtig = new BMI(182, 60);
        BMI overvægtig = new BMI(182, 90);
        BMI normalvægtig = new BMI(182, 75);
        boolean assertion10 =
            undervægtig.isUnderweight() && !undervægtig.isOverweight() && !undervægtig.isNormalWeight() &&
            !overvægtig.isUnderweight() && overvægtig.isOverweight() && !overvægtig.isNormalWeight() &&
            !normalvægtig.isUnderweight() && !normalvægtig.isOverweight() && normalvægtig.isNormalWeight();
        System.out.println("BMI virker:                     " + assertion10);

        // Test af Article (øvelse 11)
        Article article = new Article(
            "En overskrift",
            "Denne tekst er skrevet med det formål at være lang. En lang tekst er en tekst med mange ord. At teksten har mange ord, gør, at teksten også har mange tegn; det er sgu vigtigt for en tekst, der skal være så lang som muligt. \"Reservedel\" er et langt ord.",
            "Zacharias Koefoed"
        );
        boolean assertion11 = article.getLongestWord1().length() == 10 && article.getLongestWord2().length() == 10;
        System.out.println("Article virker:                 " + assertion11);

        // Test af User (øvelse 12)
        User1 user = new User1("Zacharias Koefoed");
        boolean assertion12 = user.validUserID();
        System.out.println("User virker:                    " + assertion12);

        // Test af Julegave (øvelse 13)
        Julegave julegave = new Julegave();
        boolean assertion13 = julegave.couldBeLego() || !julegave.couldBeLego(); // Tautologi (meningsløs), men så ved vi i det mindste, at klassen og metoden kører.
        System.out.println("Julegave virker:                " + assertion13);

        // Test af Image (øvelse 14)
        Image portræt = new Image("portræt.png", 200, 400);
        Image landskab = new Image("landskab.tiff", 500, 100);
        boolean assertion14 =
                portræt.isKnownFileType() &&
                !landskab.isKnownFileType() &&
                portræt.isPortrait() &&
                !landskab.isPortrait() &&
                !portræt.isLandscape() &&
                landskab.isLandscape();
        System.out.println("Image virker:                   " + assertion14);

        // Test af Square, Circle & Shape (øvelse 15)
        Shape[] shapes = {new Circle(5.65), new Square(9.99)};
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
        boolean assertion15 = Math.abs(200.0 - shapes[0].getArea() - shapes[1].getArea()) < 1.0;
        System.out.println("Square, Circle & Shape virker:  " + assertion15);

        // Test af ExamQuestion (øvelse 16)
        List<ExamQuestion> examQuestions = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            examQuestions.add(new ExamQuestion());
        }
        System.out.println(examQuestions);
        try {
            new PrintStream("questions.txt").print(examQuestions);
        } catch (FileNotFoundException ignored) {}
        boolean assertion16 = new File("questions.txt").exists();
        System.out.println("ExamQuestion virker:            " + assertion16);

        // Test af Candidate & Election (øvelse 17)
        Election election = new Election();
        election.addCandidate(new Candidate("Donald Trump", "Republican Party", 10500));
        election.addCandidate(new Candidate("Joseph Biden", "Democratic Party", 10500));
        election.addCandidate(new Candidate("Michael Mouse", "Democratic Party", 1000));
        boolean assertion17 = election.getTotalVotes() == 22000 && election.getCandidatesFromParty("Democratic Party").size() == 2;
        System.out.println("Candidate & Election virker:    " + assertion17);

        // Test af Media, Audio & Video (øvelse 18)
        Audio audio = new Audio("Me singing in the shower", 4, 20);
        Video video = new Video("My dog's 2nd birthday", 120, 16, 9);
        List<Media> media = new ArrayList<>();
        media.add(audio);
        media.add(video);
        PrintStream ps = null;
        try {
            ps = new PrintStream("mediainfo.txt");
        } catch (FileNotFoundException ignored) {}
        for (Media m : media) {
            String last = "";
            if (m instanceof Audio a) {
                ps.println("---Audio---");
                last = "Loudness: " + a.getLoudness();
            } else if (m instanceof Video v) {
                ps.println("---Video---");
                last = "Aspect ratio: " + v.getAspectRatio();
            }
            ps.println("Name: " + m.getName());
            ps.println("Duration: " + m.getDuration());
            ps.println(last);
            ps.println();
        }
        boolean assertion18 = new File("mediainfo.txt").exists();
        System.out.println("Media, Audio & Video virker:    " + assertion18);

        // Test af Dream (øvelse 19)
        List<Dream> dreams = new ArrayList<>();
        dreams.add(new Dream(10, 6, 2024, 3.5, Dream.Type.NIGHTMARE));
        dreams.add(new Dream(20, 4, 2024, 10.9, Dream.Type.PROBLEM_SOLVING));
        dreams.add(new Dream(15, 4, 2024, 9.6, Dream.Type.PROBLEM_SOLVING));
        dreams.add(new Dream(16, 4, 2024, 10.9, Dream.Type.NEUTRAL));
        dreams.add(new Dream(21, 4, 2024, 9.6, Dream.Type.NEUTRAL));
        dreams.sort(Dream.DATE_ORDER);
        boolean assertion19 = dreams.get(0).isPleasant() && dreams.get(1).isPleasant() && !dreams.get(2).isPleasant() && !dreams.get(3).isPleasant() && !dreams.get(4).isPleasant();
        System.out.println("Dream virker:                   " + assertion19);

        // Test af DataObject, User & Student (øvelse 20)
        List<DataObject> dataObjects = List.of(new User2(1, "Odin", "Kong_Odin"), new Student(2, "Thor", "thor@valhalla.dk"));
        for (DataObject dataObject : dataObjects) {
            System.out.println(Arrays.toString(dataObject.getData()));
        }
        System.out.println("DataObject, User & Student ikke testet.");

        // Test af HogwartsStudent (tirsdag)
        List<HogwartsStudent> hs = new ArrayList<>();
        hs.add(new HogwartsStudent("Harry", "Potter"));
        hs.add(new HogwartsStudent("Ron", "Weasley"));
        hs.add(new HogwartsStudent("Hermione", "Granger"));
        hs.sort(HogwartsStudent.LAST_NAME_ORDER);
        boolean assertionA = hs.get(0).getLastName().equals("Granger") && hs.get(1).getLastName().equals("Potter") && hs.get(2).getLastName().equals("Weasley");
        System.out.println("HogwartsStudent virker:         " + assertionA);

        // Test af Beer (onsdag)
        ArrayList<Beer> beers = new ArrayList<>();
        Beer beer1 = new Beer("Grøn Tuborg");
        Beer beer2 = new Beer("Tuborg Classic");
        Beer beer3 = new Beer("Carlsberg Pilsner");
        beer1.setPrice(30);
        beer2.setPrice(60);
        beer3.setPrice(90);
        beers.add(beer1);
        beers.add(beer2);
        beers.add(beer3);
        double sum2 = 0;
        for (Beer beer : beers) {
            sum2 += beer.getPrice();
        }
        double gennemsnitspris = sum2 / beers.size();
        boolean assertionB = gennemsnitspris == 60;
        System.out.println("Beer virker:                    " + assertionB);
    }
}