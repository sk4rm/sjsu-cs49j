import static assignment2.MyRecursion.indexOf;

public class Main {
    public static void main(String[] args) {
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


    }
}