package session11.lambda;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.stream.Stream;

public class TestNew {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3);
        Integer[] array = stream.toArray(Integer[]::new);

        Function<String,BigInteger> newBigInt = BigInteger::new;

    }

}
