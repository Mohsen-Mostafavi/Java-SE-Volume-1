package session09.generics;

import java.util.ArrayList;
import java.util.List;

public class Sample11<A> { // substitutes when object created

    A field;

    public A getField() {
        return field;
    }

    public void setField(A field) {
        this.field = field;
    }

    public <T> void m(T t) { // substitutes per method call

        List<T> list = new ArrayList<T>();

        list.add(t);

    }

    public static void main(String[] args) {

        Sample11 ref = new Sample11<Integer>(); /* A substitutes with Integer */

        ref.m( "ABC" ); /* T substitutes with String */
        ref.m( new Integer(20) ); /* T substitutes with Integer */
        ref.m( new Double(2.5) ); /* T substitutes with Double */

    }

}
