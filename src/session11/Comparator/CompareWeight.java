package session11.Comparator;

import java.util.Comparator;

// For doubles...
public class CompareWeight implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {

        return Double.compare( o1.getWeight(), o2.getWeight() );

    }
    
}
