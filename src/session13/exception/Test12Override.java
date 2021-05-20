package session13.exception;

class E1 extends Exception { }
class E2 extends Exception { }
class E3 extends Exception { }
class E4 extends Exception { }

public class Test12Override {
    
    void m() throws E1,E2,E3 {} 
    
}

class Test12Child extends Test12Override {
    
//    @Override
//    void m() throws E1,E2,E3 {}
    
    //void m() throws E1,E3 {}
    void m() {}
    
}

class X {

    void m() {

        Test12Override ref = new Test12Child();
        try {
            ref.m();
        } catch(Exception e) {}
    }

}
