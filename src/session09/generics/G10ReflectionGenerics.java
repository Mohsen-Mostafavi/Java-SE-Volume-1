package session09.generics;

import java.lang.reflect.*;
import java.util.*;

public final class G10ReflectionGenerics {

    /*
    Generic Superclass: java.util.ArrayList<session09.generics.BankAccount2>
    Generic Type: class session09.generics.BankAccount2
     */


    public static void main(String... args) {

        printType( new ArrayList<BankAccount2>() {} );

    }

    public static void printType(List<?> list) {

        Class c = list.getClass();

        System.out.println( "Generic Superclass: " + c.getGenericSuperclass() );

        // Type is the common superinterface for all types in Java
        Type t = ((ParameterizedType) c.getGenericSuperclass()).getActualTypeArguments()[0];

        System.out.println( "Generic Type: " + t );

        Class genericClass = (Class) t;

//        Object o = null;
//        try { o = genericClass.newInstance(); } catch(Exception e) {}
//        System.out.println( o.getClass().getName() );

    }

}

class BankAccount2 {
}