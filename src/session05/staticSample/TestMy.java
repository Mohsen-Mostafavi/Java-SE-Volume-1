package session05.staticSample;

public class TestMy {

    public static void main(String[] args) {

        My.sf = 1000;

        // No object of My

        My obj1 = new My();
        My obj2 = new My();
        My obj3 = new My();

        System.out.println( obj1.sf );
        System.out.println( obj2.sf );
        System.out.println( obj3.sf );

        obj2.sf = 5; // change the value of static field

        System.out.println( obj1.sf );
        System.out.println( obj2.sf );
        System.out.println( obj3.sf );

        My ref = new My();

        ref.m(); // non-static

        My.s(); // call s() without object

        ref.s(); // call s() on the object

        //-----------------------------------


    }

}
