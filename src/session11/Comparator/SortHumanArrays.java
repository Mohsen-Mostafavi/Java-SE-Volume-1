package session11.Comparator;

import java.util.Arrays;

public class SortHumanArrays {

    public static void main(String[] args) {

        Human[] humanArray = {
                new Human("Zahra",20, 80, 180),
                new Human("Ali"  ,45, 110,180),
                new Human("Gholi",25, 40, 173)
        };

        System.out.println("By Name ------------------------------");

        Arrays.sort( humanArray, new CompareName() );
        for (Human h : humanArray)
            System.out.println( h.getName() );

        System.out.println("By Age ------------------------------");

        Arrays.sort( humanArray, new CompareAge() );
        for (Human h : humanArray)
            System.out.println( h.getAge() );

        System.out.println("By Weight -------------------------------");

        Arrays.sort( humanArray, new CompareWeight() );
        for (Human h : humanArray)
            System.out.println( h.getWeight() );

    }

}
