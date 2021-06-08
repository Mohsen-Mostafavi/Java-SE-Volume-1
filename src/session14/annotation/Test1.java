package session14.annotation;

public class Test1 {
    
    @Good
    void m1() { 
        System.out.println("Running m1()....");
    }
    
    @Expensive(value=24000)
    //@Expensive(24000)
    //@Expensive
    void m2() {
        System.out.println("Running m2()...");
    }

    void m3() {
        System.out.println("Running m3()....");
    }


}
