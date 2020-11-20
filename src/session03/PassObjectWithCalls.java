package session03;

import session03.methodChain.Adder;

public class PassObjectWithCalls {

    public static void main(String[] args) {
        new PassObjectWithCalls().test();
    }

    void test() {
        // Syntax #1
        Adder a1 = new Adder();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        print( a1 );

        // Syntax #2
        print( new Adder() {{
            add(10);
            add(20);
            add(30);
        }} );
        // Syntax #3
        print( new Adder().add(10).add(20).add(30) );

    }

    void print(Adder adder) {

        adder.print();

    }

}
