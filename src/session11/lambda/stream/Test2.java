package session11.lambda.stream;

import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {

        Stream.of(1.5, 2.5, 3.5)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "acm" + i)
                .forEach(System.out::println);

    }

}
