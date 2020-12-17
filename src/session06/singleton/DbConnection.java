package session06.singleton;

public class DbConnection {

    // private Connection con;
    // public Connection getConnection() { return con; }

    private static DbConnection instance = null;

    private DbConnection() {
    }

    public synchronized static DbConnection getInstance(){
        if (instance==null)
            instance = new DbConnection();
        return instance;
    }
}
