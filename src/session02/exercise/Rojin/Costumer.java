package session02;

public class Costumer {
    String name;

    public void buy(){
        Seller seller1 =new Seller();
        seller1.name="Mohsen";
        seller1.request();
    }
}
