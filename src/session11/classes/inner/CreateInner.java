package session11.classes.inner;

public class CreateInner {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();

    }

}
