package session05;

public class TestLifeCycle {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("new LifeCycle().m1();");

//        LifeCycle lifeCycle = new LifeCycle();
//        lifeCycle.m1(200);
//        lifeCycle = null;

        new LifeCycle().m1(200);

        System.gc();

//        try { Thread.sleep(3*1000); } catch( InterruptedException e) { e.printStackTrace(); }
//
//        System.out.println("---------------------------------");
//
//        new LifeCycle().m1();
//
//        System.gc();
//
//        System.out.println( "static field: " + LifeCycle.s );


        //LifeCycle.sm();
        
        //Class.forName("ir.org.acm.session10.LifeCycle"); // Only load class into JVM, NO Object Created!
        
        
    }
    
}
