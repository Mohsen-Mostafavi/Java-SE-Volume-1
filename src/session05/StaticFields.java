package session05;

public class StaticFields {

    static int f1 = m();

    static int f2 = 100;

    static int m() {

        return f2;

    }

    public static void main(String[] args) {

        System.out.println( f1 );

    }

}
