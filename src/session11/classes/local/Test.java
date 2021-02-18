package session11.classes.local;

public class Test {

    public static void main(String[] args) {

        I ref = new Outer().m3();

        // ref is address of local class object

        ref.process();


        I ref2 = new Outer().m4();

        ref2.process();

    }

}
