package session09.generics;

public class G01GenericClass<A,B> { // Generic Class

    A a;
    B b;

    public G01GenericClass() {
    }

    public G01GenericClass(B b, A a) {
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

        new G01GenericClass<String, Integer>();
        new G01GenericClass<String, String>();
        new G01GenericClass(); // Object,Object

    }

    public void printType2(A a) {
        System.out.println( a.getClass().getName() );
    }

}
