package session09.generics;

public class GenericClass<A,B> { // Generic Class

    A a;
    B b;

    public GenericClass() {
    }

    public GenericClass(B b, A a) {
        this.b = b;
        this.a = a;
    }


    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public static void main(String[] args) {

        new GenericClass<String, Integer>(10,"Ali");

        new GenericClass<Integer, String>();

        new GenericClass(); // Object,Object

    }




}
