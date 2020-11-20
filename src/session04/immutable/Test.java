package session04.immutable;

public class Test {

    public static void main(String[] args) {

        A immutable = new A( 10, new Ref(10) );
        System.out.println( immutable.getNumber() );
        System.out.println( immutable.getB().getValue() );

        immutable.getB().setValue(1000); // change the Ref type value
        System.out.println( immutable.getB().getValue() );

    }

}
