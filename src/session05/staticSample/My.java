package session05.staticSample;

public class My {

    int f;

    static int sf;


    public static void main(String[] args) {

        s();
        //m(); // compile-time error
        new My().m();
        sf = 10;
        //f = 10; // compile-time error

    }

    static void s() { // No implicit argument "this"

        System.out.println("running static method s()....");
        //this.m(); // compile-time error
        //m(); // compile-time error
        new My().m();

    }


    void m(/* Object this */) { // "this" is available!

        System.out.println("running non-static method m()....");
        this.m2();
        m2(); // this.m2();
        //s();

    }

    void m2() {

        System.out.println("running non-static method m2()....");

    }

}
