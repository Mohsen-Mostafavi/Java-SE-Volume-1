package session08.bankaccounts;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {

//        BankAccount ba = new CurrentAccount(1234,"ali",3000);

//        DepositAccount depositAccount = (DepositAccount) ba;


//        ArrayList list1 = new ArrayList();
//        list1.add( new CurrentAccount(1,"acm",1) );
//        list1.add( 1 );
//        list1.add( "ABC" );
//        CurrentAccount acc  = (CurrentAccount) list1.get(0);
////        CurrentAccount acc2 = (CurrentAccount) list1.get(1);
//
//
//        for (Object obj : list1) {
//            if (obj instanceof CurrentAccount) {
//                CurrentAccount bb = (CurrentAccount) obj;
//                System.out.println( bb.getOwner() );
//            }
//        }

        ArrayList<CurrentAccount> list1 = new ArrayList<>();
        list1.add(new CurrentAccount(10,"Ali",1000));
//        list1.add("ACM");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ACM");
//        list2.add(new CurrentAccount(10,"Ali",1000));


        ArrayList list3 = new ArrayList();

    }


}
