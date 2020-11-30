package session04.str;

public class TestNewCapacity {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("ABC");
        System.out.println( "1) capacity is: " + sb.capacity() ); // 19

        sb.trimToSize();
        System.out.println( "2) capacity is: " + sb.capacity() ); // 3

        sb.append("D");
        System.out.println( "3) capacity is: " + sb.capacity() ); // 8

    }

}
