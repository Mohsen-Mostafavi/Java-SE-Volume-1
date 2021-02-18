package session11.Comparator;

import java.util.Comparator;

// For Integers
public class CompareAge implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {

        return Integer.compare( o1.getAge(), o2.getAge() );

        // return (x < y) ? -1 : ((x == y) ? 0 : 1);

        // return o1.getAge() - o2.getAge();

    }

}
