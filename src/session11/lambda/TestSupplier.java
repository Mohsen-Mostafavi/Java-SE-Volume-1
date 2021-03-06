package session11.lambda;

import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {

        String s = "acm.org.ir";

        print( new Supplier<String>() {
            @Override
            public String get() {
                return s.toString();
            }
        });

        print( () -> s.toString() );

        print( s::toString );

    }

    public static void print(Supplier<String> supplier)  {

        System.out.println( supplier.get() );

    }

}