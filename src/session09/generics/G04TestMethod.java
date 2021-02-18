package session09.generics;

import session07.bankaccounts.BankAccount;

public class G04TestMethod {

    public static void main(String[] args) {

        G04TestMethod t = new G04TestMethod();

//        t.printType2(new BankAccount(10,"ACM",1000));
//
//        t.printType2(new Double(10));

        Object[] list = { 1000, "ABC", new Object(), new int[0] };

        for( Object obj : list) {
            t.printType(obj);
        }
//        G01GenericClass<String,Integer> g1= new G01GenericClass<>();
//        g1.printType2("string");
//
//        G01GenericClass<Double,Integer> g2 = new G01GenericClass<>();
//
//        g2.printType2(20d);

    }

    /*
    java.lang.Integer
    java.lang.String
    java.lang.Object
    [I
    */

    void printType(Object o) {
        System.out.println( o.getClass().getName() );
    }

    <T> void printType2(T o) {
        System.out.println( o.getClass().getName() );
    }

}
