package session07.composition;


public class C extends A{

//    private A a = new A();
    private B b = new B();

    int f3;

    public C() {
        System.out.println("An object of C is created!");
    }

//    @Override
//    public void m1() {
//        a.m1();
//    }
//
    public void m2() {
        b.m2();
    }

    public void m3() {
        m1();
        b.m2();
        /*??*/
    }

    //static void staticMethod() { B.staticMethod(); }

}
