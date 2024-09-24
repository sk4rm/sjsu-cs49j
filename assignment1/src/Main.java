import assignment1.MyCard;
import assignment1.MyMatrix;
import assignment1.MyTime;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // MyTime tests
        MyTime.printTimeDifference("0120", "1510");
        System.out.println("\n13 hour(s) 50 minute(s)");

        MyTime.printTimeDifference("1635", "0250");
        System.out.println("\n10 hour(s) 15 minute(s)");

        // MyCard tests
        MyCard card1 = new MyCard("10S");
        MyCard card2 = new MyCard("QC");
        MyCard card3 = new MyCard("11H");

        System.out.println(card1.getSuit());
        System.out.println(card2.getSuit());
        System.out.println(card3.getSuit());

        // MyMatrix tests
        int[][] array1 = {{2, 4}, {3, 4}};
        MyMatrix matrix1 = new MyMatrix(array1);
        array1[0][0] = 5;
        System.out.println(matrix1);

        int[][] array2 = {{1, 2}, {1, 3}};
        MyMatrix matrix2 = new MyMatrix(array2);
        MyMatrix result = matrix1.multiply(matrix2);
        System.out.println(result);

    }
}