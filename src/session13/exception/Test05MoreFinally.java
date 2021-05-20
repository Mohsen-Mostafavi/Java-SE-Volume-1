package session13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test05MoreFinally {

    public static void main(String[] args) {

        System.out.println( m1() );

    }

    static int m1() {

        try {
            Class.forName("NotExist");
        } catch(ClassNotFoundException e) {
            return 0;
        } finally {
            return 1;
        }

    }

    static void m2() {

        FileInputStream f = null;

        try {

            f = new FileInputStream("f.txt");

            // do somthing with the file --> may throw exception

            // f.close() --> should be moved to finally block

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } finally {

            try { f.close(); } catch(IOException e) { e.printStackTrace(); }

        }

    }


}
