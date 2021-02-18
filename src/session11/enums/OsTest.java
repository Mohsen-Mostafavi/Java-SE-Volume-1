package session11.enums;

public class OsTest {
    
    public static void main(String[] args) {
        
        Os my;
        
        my = Os.LINUX;
        
        if (my == Os.LINUX) System.out.println("Target OS is Linux!");
        else System.out.println("Target OS is not Linux!");
        
        System.out.println( Os.LINUX.getVersion() );

        Os.LINUX.setVersion(14);

        Os.LINUX.m();

        Os[] arr = Os.values();

        System.out.println( Os.LINUX.ordinal() );

    }

}
