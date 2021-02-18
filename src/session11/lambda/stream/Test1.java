package session11.lambda.stream;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("acm", "c4", "java", "c2"); // ArrayList

        myList  .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }

}

//.map( (Object o) -> { return "Hello " + o; } )
//.map( o -> "Hello " + o )
//.map( s -> s.toUpperCase() )

