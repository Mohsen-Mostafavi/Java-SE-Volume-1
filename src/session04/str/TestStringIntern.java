package session04.str;

import session04.immutable.Student;

import java.util.Scanner;

public class TestStringIntern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        // Case 1: COMPILER OPTIMIZATION, Interning

        String s1 = "ABC";
        String s2 = "ABC";



        if (s1 == s2) // compare address
            System.out.println("Case 1: The Same Object! (used pool)");


        // Case 2: No COMPILER OPTIMIZATION, New Object Created

        String s3 = new String("ABC");
        String s4 = new String("ABC");

        System.out.println("Case 2: The Same Object? : " + (s3 == s4) ); // compare address --> false


        // Case 3: Manual Interning!

        String s5 = new String("ABC").intern();
        String s6 = new String("ABC").intern();

        if (s5 == s6) // compare address
            System.out.println("Case 3: The Same Object! (used pool)");
        if (s1 == s5) // compare address
            System.out.println("Case 3: The Same Object with case 1! (used pool)");

        // Case 4: Manual Interning!

        String s7 = new String("XYZ").intern();
        String s8 = new String("XYZ").intern();

        if (s7 == s8) // compare address
            System.out.println("Case 4-1: The Same Object! (used pool)");

        System.out.println("Case 4-2: The Same Object with case 1? " + (s1 == s7) );

        System.out.println("please eneter ABC: ");

        String s9 = scanner.next();

        if (s1==s9)
            System.out.println("The Same address");

    }

}
