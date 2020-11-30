package session04;

public class TestReadOnly {
    public static void main(String[] args) {

        ReadOnly r1 = new ReadOnly(10);
        System.out.println( r1.getValue() );

        ReadOnly r2 = new ReadOnly(20);
        System.out.println( r2.getValue() );

        ReadOnly r3 = new ReadOnly(30);
        System.out.println( r3.getValue() );

    }
}
