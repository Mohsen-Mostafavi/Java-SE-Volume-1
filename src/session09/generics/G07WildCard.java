package session09.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class G07WildCard {

    public static void main(String[] args) {

        List<Object> objects = new ArrayList<Object>();

        List<?> wildCardList = new ArrayList<String>( Arrays.asList("A", "B") );
        // When you use wildcard type <?>, you say to the compiler that you are ignoring the type information,

        wildCardList.remove(0); // remove() method does not require Generic Type

//        wildCardList.add( "C" ); // compile-time Error, add() method requires Generic Type

        wildCardList.get(10);

        System.out.println(wildCardList);

    }

}
