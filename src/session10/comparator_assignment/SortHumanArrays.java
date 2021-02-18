package session10.comparator_assignment;

public class SortHumanArrays {

    public static void main(String[] args) {

        Human[] humanArray = {
                new Human("Zahra",20, 80, 180),
                new Human("Ali"  ,45, 110,180),
                new Human("Gholi",25, 40, 173)
        };

        System.out.println("By Name ----------------------------");
        System.out.println("By Age -----------------------------");
        System.out.println("By Weight --------------------------");

//        Arrays.sort( humanArray, new CompareName() );

//        for (Human h : humanArray)
//            System.out.println( h.getName() );



    }

}
