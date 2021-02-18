package session10.interface9;

public interface I {

    private void pm() {
        System.out.println("Running private void pm()...");
    } // after Java 9

    default void m() {
        System.out.println("Running void m()...");
        pm();
    }

}
