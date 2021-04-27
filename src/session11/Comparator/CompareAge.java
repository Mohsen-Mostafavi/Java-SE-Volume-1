package session11.Comparator;

import java.util.Comparator;

// For Integers
public class CompareAge implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {

        return Integer.compare( o1.getAge(), o2.getAge() );

//         return (o1.getAge() < o2.getAge()) ? -1 : ((o1.getAge() == o2.getAge()) ? 0 : 1);

//         return o1.getAge() - o2.getAge();

    }

}
