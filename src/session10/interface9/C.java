package session10.interface9;

public class C implements I {

    void method() {

        // pm(); // compile-time error

        m();

    }

    public static void main(String[] args) {

        new C().method();
        
    }




}
