package session03;

public class FinalInit {
    // final int MAX; // not possible if no initialization is done!
    final int MAX = 10; // direct init -> SEQ #1 XOR

    {
        //MAX = 10; // init block -> SEQ #2 XOR
    }


    FinalInit() {
        //MAX = 10; // constructor -> SEQ #3 XOR
    }

    void m() {
        // MAX = 10; // Not Possible!
    }

    void local() {

        final int MY = 10;
        // MY = 20; // not possible

        final int MY2;
        MY2 = 20;
        // MY2 = 30; // not possible

    }
}
