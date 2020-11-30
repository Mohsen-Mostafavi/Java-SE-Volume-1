package session04.str;

public class CompareString {

    public static void main(String[] args) {

        String s1 = "Ali";
        String s2 = "AliReza".substring(0, 3); // "Ali"

        // compare values
        if ( s2.equals(s1) ) // compare values character by character
            System.out.println("Compare String with .equals");


        // compare address
        if ( s2 == s1 ) // the same value, but different address
            System.out.println("Compare String with ==");

    }

}
