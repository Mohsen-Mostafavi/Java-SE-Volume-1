package session12.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ItereatorSample { // Single Thread Sample

    public static void main(String[] args) {

        ArrayList<String> my = new ArrayList();
        my.add("ABC");

//        for (String str : my) {
//            my.remove(str); // java.util.ConcurrentModificationException
//        }

        Iterator<String> iter = my.iterator();
        while (iter.hasNext()) {
            iter.next();
            iter.remove(); // OK
        }

        System.out.println( my.size() );

    }

}
