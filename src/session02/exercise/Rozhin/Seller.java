package session02;

public class Seller {
    String name;

    public void request(){
        StoreKeeper storeKeeper1=new StoreKeeper();
        storeKeeper1.name="Ebrahimi";
        storeKeeper1.deliver();
    }
}
