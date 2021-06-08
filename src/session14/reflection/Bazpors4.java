package session14.reflection;

import java.util.ArrayList;
import java.util.List;

public class Bazpors4 { // Using Class Literal

    public static void main(String[] args) {

        Holder<BankAccount> b = new Holder<BankAccount>();

        List<BankAccount> my = b.createList( BankAccount.class );

    }

}

class Holder<T> {

    List<T> createList(Class<T> c) {

        // System.out.println( c.getName() );

        List<T> list = null;

        try {
            list = new ArrayList<T>(1);
            list.add( c.newInstance() ); // create an object of class literal
        } catch(Exception e) {
            System.out.println("Cannot Create Object!");
        }

        return list;

    }

}
