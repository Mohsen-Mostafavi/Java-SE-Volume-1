package session11.classes.local;

public class Outer {

    int field; // Heap


    void m() {

        int localVar = 100; // Stack
        // localVar++; // compile-time error in local class

        class Local {

            void test() {

                // localVar++; // compile-time error
                System.out.println( field );
                System.out.println( localVar );

            }

        }

        Local obj = new Local();

    }


    Object m2() {

        int localVar = 100; // in Stack

        class Local {

        }

        Local obj = new Local(); // in Heap

        return obj;

    } // end of method , so end of localVar lifetime!


    I m3() {

        class Local implements I {

            public void process() {
                field++;
            }

        }

        Local inter = new Local();

        return inter;

    }

    I m4() { // anonymous

        return new I() { // begin of anonymous class: Outer$1.class

            public void process() {
                System.out.println("I am Anonymous class method!");
            }

        }; // end of anonymous class

    }


    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.m();

        Object o = outer.m2();

        I i =  outer.m3();

        i.process();

        I i2 = outer.m4();
    }

}
