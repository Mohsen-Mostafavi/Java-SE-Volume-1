package session13.exception;

public class Test10Swallowing {
    
    // Swallowing Exception (Entity Practice!)
    
    public static void main(String[] args) {

        try {

            Class.forName("notExists");

        } catch(ClassNotFoundException e) {
//      } catch(ClassNotFoundException ignore) {

            // ???

        }

    }

}
