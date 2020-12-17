package session06.singleton;

public class TestGod {
    public static void main(String[] args) {
//        God g = new God();
        God g1 = God.getInstance();
        God g2 = God.getInstance();

        //-----------------------------

        God g3 = God.getInstance(); // Lazy

        God2 g4 = God2.getInstance(); // Eager

        God3 g5 = God3.INSTANCE;



        if (g1 == g2) System.out.println("the same god");
        else System.out.println("2 gods!!!");
    }
}
