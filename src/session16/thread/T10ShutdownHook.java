package session16.thread;

public class T10ShutdownHook {
    
    public static void main(String[] args) {
        
        System.out.println("Process Started...");

        Thread t = new Thread() {
            public void run() {
                System.out.println("ShutdownHook: Goodbye World!");
            }
        };

        Runtime.getRuntime().addShutdownHook( t );

        //System.exit(0); // run the ShutdownHook & terminate jvm process
        //Runtime.getRuntime().halt(0); // NO Shutdown Hooks!
        //throw new RuntimeException(); // run the ShutdownHook & terminate jvm process
        //Using Ctrl + c to terminate: run the ShutdownHook & terminate jvm process

        System.out.println("The end of code...");
        
    }

}
