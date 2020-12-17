package session06.singleton;

// Singleton Design Pattern
public final class God { // Lazy

    // fields
    // method

    private static God instance = null;

    private God() {
    }

    public synchronized static God getInstance(){
        if (instance==null){
            instance = new God();
        }
        return instance;
    }
}
