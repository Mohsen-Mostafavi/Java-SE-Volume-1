package session03.exercise.rozhin;


import java.util.Scanner;

public class Customer {

    public void request() {

        System.out.println("0 or 1?");
        Scanner scaner = new Scanner(System.in);

        Goods goods = new Goods(scaner.nextInt());

        if (goods.type == 0) {
            Seller seller1 = new Seller();
            seller1.request1();
        } else {
            Seller seller2 = new Seller();
            seller2.request2();
        }
    }


}
