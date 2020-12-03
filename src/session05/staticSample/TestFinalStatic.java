package session05.staticSample;

public class TestFinalStatic {

    final static int A = 100; // can be inline by compiler

    final static int B;

    final static int C = m();

    static {
        B = 200;
    }

    static int m() {
        return 300;
    }


//    {
//        B = 200; // Not possible
//    }

//    public TestFinalStatic() {
//        B = 200; // Not possible
//    }

}
