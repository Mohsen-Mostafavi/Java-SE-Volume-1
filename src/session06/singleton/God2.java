package session06.singleton;

public final class God2 { // Eager
    // fields
    // method

    private final static God2 instance = new God2();

    private God2() {
    }

    public static God2 getInstance(){
        return instance;
    }
}
