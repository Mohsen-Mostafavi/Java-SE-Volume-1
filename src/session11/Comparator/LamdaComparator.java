package session11.Comparator;

import java.util.Arrays;

public class LamdaComparator {
    
    public static void main(String[] args) {

        Human[] humanArray = {
                new Human("Zahra",20, 80, 180),
                new Human("Ali"  ,45, 110,180),
                new Human("Gholi",25, 40, 173)
        };
        
        //Compare Age
        Arrays.sort( humanArray,(Human o1, Human o2) -> {
            return o1.getAge() - o2.getAge();
        } );
        
    }
}
