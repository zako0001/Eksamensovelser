import java.util.*;
import java.util.stream.Collectors;

public class Article {

    // Attributes
    private String heading;
    private String body;
    private String author;

    // Constructor
    public Article(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    // Methods
    public Set<String> getWords1() {
        // Funktionel med regex
        return Arrays.stream(body
                        .toLowerCase()
                        .replaceAll("[^a-zæøåáé'-]", " ")
                        .split(" ")
                ).filter(string -> !string.isBlank())
                .collect(Collectors.toSet());
    }

    public ArrayList<String> getWords2() {
        // Imperativ med brug af ArrayList i stedet for Set
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (char c : body.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                word += c;
            } else if (!word.isEmpty()) {
                if (!words.contains(word)) {
                    words.add(word);
                }
                word = "";
            }
        }
        return words;
    }

    public String getLongestWord1() {
        // Funktionel
        return getWords1().stream()
                .sorted(Comparator.comparing(String::length))
                .toList()
                .getLast();
    }

    public String getLongestWord2() {
        // Imperativ
        String longestWord = "";
        for (String word : getWords2()) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}