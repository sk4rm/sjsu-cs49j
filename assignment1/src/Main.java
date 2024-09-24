import assignment1.MyCard;
import assignment1.MyTime;

public class Main {
    public static void main(String[] args) {
        MyTime.printTimeDifference("0120", "1510");
        System.out.println("\n13 hour(s) 50 minute(s)");

        MyTime.printTimeDifference("1635", "0250");
        System.out.println("\n10 hour(s) 15 minute(s)");

        MyCard card1 = new MyCard("10S");
        MyCard card2 = new MyCard("QC");
        MyCard card3 = new MyCard("11H");

        System.out.println(card1.getSuit());
        System.out.println(card2.getSuit());
        System.out.println(card3.getSuit());
    }
}