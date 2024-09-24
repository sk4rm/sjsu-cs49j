package assignment1;

public class MyCard {
    private final String suit;

    public MyCard(String shorthand) {
        char shortSuit = shorthand.charAt(shorthand.length() - 1);
        suit = switch (shortSuit) {
            case 'H' -> "Hearts";
            case 'C' -> "Clubs";
            case 'S' -> "Spades";
            case 'D' -> "Diamonds";
            default -> "Unknown";
        };
    }

    public String getSuit() {
        return suit;
    }
}
