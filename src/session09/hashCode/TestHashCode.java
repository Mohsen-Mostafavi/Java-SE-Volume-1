package session09.hashCode;

// VM Option --> -XX:hashCode=3

public class TestHashCode {

    public static void main(String[] args) {

        for(int i=0; i<10; i++) {
            A a = new A();
            a.name="name"+i;
//            System.out.println( a.hashCode() );
            System.out.println( a.toString() );
        }

        for(int i=0; i<10; i++) {
            B b = new B();
//            System.out.println( b.hashCode() );
            System.out.println( b.toString() );
        }

//        System.gc();
//
//        try { Thread.sleep(1000); } catch(InterruptedException e) { }
//
//        A a = new A();
//        System.out.println("----- GC ------");
//        System.out.println( a.hashCode() );

    }

}

/*

Default Algorithm in Java 8:
has as a per-thread seed, uses Marsaglia's xor-shift scheme to produce pseudo-random numbers.

21685669
2133927002
1836019240
325040804
1173230247
856419764
621009875
1265094477
2125039532
312714112

*/

/*

With -XX:hashCode=3
Counts up the hash code values, starting from zero.

44
45
46
47
48
49
50
51
52
53

*/
