package session06.inheritance;

public class TestInheritance2 {

    public static void main(String[] args) {

        C ref3 = new C(); // Actual Object is C
        B ref2 = ref3;
        A ref1 = ref2;

        if (ref1 == ref2 && ref2 == ref3 )
            System.out.println( "The same Object!" );

        ref3.m1();
        ref3.m2();
        ref3.m3();

        ref2.m1();
        ref2.m2();
        //ref2.m3();

        ref1.m1();
        //ref1.m2();
        //ref1.m3();

        ( (C)ref1 ).m3(); // Reference Casting

    }

}
