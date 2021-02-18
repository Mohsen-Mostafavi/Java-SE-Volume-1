package session10.strategy;

public class TestDetabase {
    public static void main(String[] args) {
        DatabaseAction databaseAction = new DatabaseAction();
        databaseAction.setSort(new Bubel());
        databaseAction.insert();




        databaseAction.setSort(new Random());
        databaseAction.insert();
        databaseAction.delete();
    }
}
