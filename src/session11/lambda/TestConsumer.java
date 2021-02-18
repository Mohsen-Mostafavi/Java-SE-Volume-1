package session11.lambda;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        Consumer c = System.out::print; // f(x)

        c.accept("ACM");  // System.out.print("ACM");

    }

    void x(Consumer c, String s) { // g(x)

        c.accept( s );

        // System.out.print("ACM");

    }


}
