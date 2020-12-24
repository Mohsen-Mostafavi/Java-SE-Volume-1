package session07.override;

public class Test {

    public static void main(String[] args) {

//        SuperClass s = new SubClass();

        SubClass s = new SubClass();


        s.m(); // Override for non-static method --> depends on actual object implementation

//        s.x(); // NO Override for static method --> depends on reference type

        //s.eat();

    }

}
