package session04.immutable;

public class A { // Immutable

    private final int number; // primitive
    private final Ref r; // reference

    public A(int number, Ref b) {
        this.number = number;
        this.r = b;
    }

    public int getNumber() {
        return number;
    }

    public Ref getB() {
        //return b;
        return new Ref(r);
    }

}
