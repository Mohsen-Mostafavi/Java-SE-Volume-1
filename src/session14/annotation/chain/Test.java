package session14.annotation.chain;

public class Test {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println( "A:" + a.getClass().isAnnotationPresent(Entity.class) );
        System.out.println( "B:" + b.getClass().isAnnotationPresent(Entity.class) );
        System.out.println( "C:" + c.getClass().isAnnotationPresent(Entity.class) );

    }

}
