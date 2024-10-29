package assignment2;

public class MyRecursion {
    public static int indexOf(String str, String substr) {
        return indexOf(str, substr, 0);
    }

    private static int indexOf(String str, String substr, int start) {
        if (start > str.length() - substr.length()) return -1;

        String window = str.substring(start, start + substr.length());
        if (window.equals(substr)) return start;

        return indexOf(str, substr, start + 1);
    }
}
