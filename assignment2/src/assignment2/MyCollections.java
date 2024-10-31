package assignment2;

import java.util.Collection;
import java.util.Iterator;

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
}
