package session13.exception;

public class Test04Finally {
    
    public static void main(String[] args) {
            
        try {
            System.out.println( "1" );
            Class.forName("session15.exception.Test04Finally");
            System.out.println( "2" );

        } catch(ClassNotFoundException e) {
            
            System.out.println( "catch block! " + e.getMessage() );

        } finally {

            System.out.println( "Run anyway after try / catch block" );

        }    

    }
    
}
