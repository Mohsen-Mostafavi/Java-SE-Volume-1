package session12.collections;

import java.util.ArrayList;

public class TestParam {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Ali");
        list.add("Reza");
        list.add("Hassan");

        m( list );

        m( new ArrayList() {{ // anonymous class
            add("Ali");
            add("Reza");
            add("Hassan");
        }} );

    }

    static void m(ArrayList list) { }

}

