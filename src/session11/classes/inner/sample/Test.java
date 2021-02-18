package session11.classes.inner.sample;

public class Test {

    public static void main(String[] args) {

        Hand h = new Hand();
        System.out.println( h.getName() );



        Hand.Finger f = h.new Finger();


        System.out.println( f.getName() );

    }

}
