package session03.methodChain;

public class TestAdder {
    public static void main(String[] args) {
        Adder a = new Adder();

        // Normal Method Call
        a.add(10);
        a.add(20);
        a.add(30);
        a.print();


        // Method Chaining
        a.add(10).add(20).add(30).print();

        // Free format Method Chaining
        a.
                add(10).
                add(20).
                add(30).
                print();
    }
}
