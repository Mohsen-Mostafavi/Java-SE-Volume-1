package session13.exception;

public class Test09Rethrow {
    
    // Rethrow
    
    public static void main(String[] args) {
            
        try {
            m1();
//        } catch (ClassNotFoundException e) {
//            System.out.println("1111");
        } catch (Exception e) {
            System.out.println("System is not working");
        }
        
    }
    
    static void m1() throws Exception {

        try {
            Class.forName("NotExist");
            // by-pass
        } catch (ClassNotFoundException e) {
            // handling
            System.out.println("log exception");
            throw e; // throw new Exception(e);
        }
        System.out.println("AAAAA");
        
    }
    
}
