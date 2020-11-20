package session03.exercise.qazale;

public class Buy {

    {
        System.out.println("Thank you");

    }

    public static void main(String[] args) {
        GoodsGroup goodsGroup = new GoodsGroup();
        if (goodsGroup.electricsGroup.equals(true)){
            Seller seller = new Seller("mary","jane","00123506985");
            Inventor inventor = new Inventor("jack","jonson","0025963581");
        }
        else {
            Seller seller2 = new Seller("mahsa","jarah","0025962586");
            Inventor inventor2 = new Inventor("jame","fredi");
        }
        System.out.println("here u r");
    }
}
