package session14.reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class ReflectionGenerics {

    public static void main(String... args) {

        printType( new ArrayList<BankAccount>() {} );

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

