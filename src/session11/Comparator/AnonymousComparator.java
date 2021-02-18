package session11.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousComparator {

    // Field
    Comparator<Human> f = new Comparator<Human>(){ // Anonymous class
        public int compare(Human o1, Human o2) {
            return Integer.compare( o1.getAge(), o2.getAge() );
        }
    };

    public static void main(String[] args) {

        Human[] humanArray = {
                new Human("Zahra",20, 80, 180),
                new Human("Ali"  ,45, 110,180),
                new Human("Gholi",25, 40, 173)
        };
        
        //compare Age
        Arrays.sort( humanArray, new Comparator<Human>(){ // Anonymous class
            public int compare(Human o1, Human o2) {
                return Integer.compare( o1.getAge(), o2.getAge() );
            }
        });

        //--------------------------------------------------------------------------

        // Local Variable
        Comparator<Human> ref = new Comparator<Human>(){ // Anonymous class
            public int compare(Human o1, Human o2) {
                return Integer.compare( o1.getAge(), o2.getAge() );
            }
        };

        Arrays.sort(humanArray, ref);

    }

    void m() {

        Human[] humanArray = {
                new Human("Zahra",20, 80, 180),
                new Human("Ali"  ,45, 110,180),
                new Human("Gholi",25, 40, 173)
        };

        Arrays.sort(humanArray, this.f);

    }
     
}
