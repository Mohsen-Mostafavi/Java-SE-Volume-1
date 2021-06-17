package session16.thread;

public class T07AnonymousThread {
    
    public static void main(String[] args) {
        
        method();
        
        // Anonymous
        new Thread() {
            @Override public void run() {
                method();
            } }.start();
        
        // Lambda
        new Thread( () -> method() ).start();

        // Method Reference
        new Thread( T07AnonymousThread::method ).start();
        
    }

    static void method() {
        System.out.println( Thread.currentThread().getName() );
    }

}
