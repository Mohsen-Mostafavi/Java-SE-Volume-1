package session04;

public class TestWrapper {

    public static void main(String[] args) {

        int i = 10; // primitive

        Integer j = new Integer(10); // reference

        int another = j.intValue();

        // AFTER 1.5

        // Autobox
        Integer num = 10;

        // unbox
        int k = num;


        if (j == num) // compare addresses not values!!!!
            System.out.println("The same Value!");
        else
            System.out.println("Different Value!!!!!");

        if ( j.equals(num) ) // compare values!!!!
            System.out.println("The same Value!");
        else
            System.out.println("Different Value!");


        // Integer Cache!!!
        // range [-128, 127] must be interned (JLS7 5.1.7)

        Integer c1 = 0;
        Integer c2 = 0;

        if (c1 == c2) // compare addresses not values!!!!
            System.out.println("The same Value!");
        else
            System.out.println("Different Value!!!!!");

        if ( c1.equals(c2) ) // compare values!!!!
            System.out.println("The same Value!");
        else
            System.out.println("Different Value!");
    }

}
