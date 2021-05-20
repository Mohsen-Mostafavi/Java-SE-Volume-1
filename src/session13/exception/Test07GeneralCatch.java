package session13.exception;

public class Test07GeneralCatch {
    
    public static void main(String[] args) {
            
        try {
            
            Class.forName("exception.Test00");
            Integer.parseInt("1a2");
            // m3()
            // m4()

        } catch(NumberFormatException e) {

            System.out.println("not a number!");

        } catch(Exception e) { // Any Other exception

            e.printStackTrace();

        }

    }
    
}
