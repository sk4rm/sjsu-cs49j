import java.util.ArrayList;
import java.util.LinkedList;

import static assignment2.MyCollections.downsize;
import static assignment2.MyCollections.isBalanced;
import static assignment2.MyFile.writePrimes;
import static assignment2.MyRecursion.indexOf;

public class Main {
    public static void main(String[] args) {
        // MyRecursion driver
        int index;

        index = indexOf("Mississippi", "sip");
        if (index != 6) {
            System.out.println(
                    "Since sip starts after the 6th letter of Mississippi, " +
                    "after executing the code, index should be 6. Got " + index
            );
        }

        index = indexOf("panda", "pan");
        if (index != 0) {
            System.out.println(
                    "Since panda starts with pan, after executing the code, index should be 0. "
                    + "Got " + index
            );
        }

        index = indexOf("Hello world", "wow");
        if (index != -1) {
            System.out.println(
                    "Since wow is not a substring of Hello world, after executing the code, index should be -1. "
                    + "Got " + index
            );
        }

        // MyFile driver
        writePrimes("file1.txt", "file2.txt");

        // MyCollections driver
        LinkedList<String> list = new LinkedList<>();
        list.add("Tom");
        list.add("Bob");
        list.add("Cathy");
        list.add("Alice");
        list.add("Trudy");
        list.add("Harry");
        list.add("Denny");

        System.out.println("Before downsize:");
        for (String x : list) System.out.println(x);

        downsize(list, 3);

        System.out.println("\nAfter downsize:");
        for (String x : list) System.out.println(x);

        if (!isBalanced("println(list.get(0))")) System.out.println("println(list.get(0)) should be balanced");
        if (!isBalanced("[](3*5)^2")) System.out.println("[](3*5)^2 should be balanced");
        if (isBalanced("[(2+3]*5)^2")) System.out.println("[(2+3]*5)^2 should be imbalanced");
        if (isBalanced("println(list.get(0)")) System.out.println("println(list.get(0) should be imbalanced");
        if (isBalanced("[(3*5)]^2]")) System.out.println("[(3*5)]^2] should be imbalanced");
    }
}