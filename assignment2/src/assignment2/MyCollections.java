package assignment2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class MyCollections {
    /**
     * Removes every n element in the collection
     * @param collection The collection of strings to downsize
     */
    public static void downsize(Collection<String> collection, int n) {
        int i = 1;
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            it.next();
            if (i % n == 0) it.remove();
            i++;
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (Character c : s.toCharArray()) {
            switch (c) {
                // Opening
                case '(', '[', '{':
                    stack.push(c);
                    break;

                // Closing
                case ')':
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != '(') return false;
                    break;

                case ']':
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != '[') return false;
                    break;

                case '}':
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != '{') return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}
