package session12.thearray;

// VM Options: -Xmx8g

public class HeapReport {
    
    public static void main(String args[]) {
        
        Runtime r = Runtime.getRuntime();
        
        System.out.println("Used Memory   : " + (r.totalMemory() - r.freeMemory()) + " bytes");
        System.out.println("Free Memory   : " + r.freeMemory() + " bytes");
        System.out.println("Total Memory  : " + r.totalMemory() + " bytes");
        System.out.println("Max Memory    : " + r.maxMemory() + " bytes");

        final int ARRAY_MAX_SIZE = Integer.MAX_VALUE - 2;
        System.out.println();
        System.out.println("Creating Max Size (2*2G) Array : " + ARRAY_MAX_SIZE);
        System.out.println();

        delay(2);
        byte[] array = new byte[ARRAY_MAX_SIZE];
        byte[] more  = new byte[ARRAY_MAX_SIZE];

        System.out.println("Used Memory   : " + (r.totalMemory() - r.freeMemory()) + " bytes");
        System.out.println("Free Memory   : " + r.freeMemory() + " bytes");
        System.out.println("Total Memory  : " + r.totalMemory() + " bytes");
        System.out.println("Max Memory    : " + r.maxMemory() + " bytes");

        System.out.println();
        System.out.println("Releasing (2*2G) Array : " + ARRAY_MAX_SIZE);
        System.out.println();

        delay(2);
        array = null;
        more = null;
        System.gc();
        delay(2);

        System.out.println("Used Memory   : " + (r.totalMemory() - r.freeMemory()) + " bytes");
        System.out.println("Free Memory   : " + r.freeMemory() + " bytes");
        System.out.println("Total Memory  : " + r.totalMemory() + " bytes");
        System.out.println("Max Memory    : " + r.maxMemory() + " bytes");

        while (true);

    }

    static void delay(long s) {
        try {
            Thread.sleep(s*1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
   }
    
}
