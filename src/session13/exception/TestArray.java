package session13.exception;

public class TestArray {

    public static void main(String[] args) {

        // When there is no command line argument, args is zero sized array

        try {

            if (args == null) { // MISTAKE!!!
                System.out.println("args is null!");
                return;
            }

            String s = args[0]; // throws  java.lang.ArrayIndexOutOfBoundsException: 0

            System.out.println(s);

        } catch (RuntimeException e) {
            System.out.println(e.toString()); // java.lang.ArrayIndexOutOfBoundsException: 0
        }
        
        System.out.println("edameh!");

    }

}
