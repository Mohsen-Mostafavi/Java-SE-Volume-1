package session09.generics;


public class G08MyBridge {

    public static void main(String[] args) {

        Object obj = new Child();
        ( (Parent) obj ).m("ABC"); // Child / String Version....
        ( (Child)  obj ).m("ABC"); // Child / String Version....
    }

}

class Parent {

    void m(Object obj) {
        System.out.println("Parent / Object Version....");
    }

}

class Child extends Parent {

    @Override
    void m(Object obj) { // Bridge Method
        m( (String)obj );
    }

    void m(String obj) {
        System.out.println("Child / String Version....");
    }

}
