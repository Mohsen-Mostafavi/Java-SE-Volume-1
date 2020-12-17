package session06.inheritance;

public class TestInheritance3 {

    public static void main(String[] args) {

        C ref = new C();

        ref.m1();
        ref.m2();
        ref.m3();

        ref.staticMethod();

        C.staticMethod();

        B.staticMethod();

        // A.staticMethod(); // Compile-time Error

    }

}
