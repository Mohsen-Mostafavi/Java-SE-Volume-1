package session09.generics;

import session07.bankaccounts.BankAccount;
import session07.bankaccounts.CurrentAccount;

import java.util.ArrayList;

public class G03TestArraylist {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(); // RAW TYPE
        list1.add( new CurrentAccount(1,"acm",1) );
        list1.add( 1 ); // Object e = new Integer(1)
        list1.add( "ABC" );
        CurrentAccount acc  = (CurrentAccount) list1.get(0);
//        CurrentAccount acc2 = (CurrentAccount) list1.get(1); // java.lang.ClassCastException

        // NO GENERICS, Before 1.5
        for (Object obj : list1) {
            if (obj instanceof CurrentAccount) {
                CurrentAccount ba = (CurrentAccount) obj;
                System.out.println( ba.getOwner() );
            }
        }

        //----------------------------------------------------------------

        ArrayList<BankAccount> list2 = new ArrayList<BankAccount>();
        list2.add( new CurrentAccount(1,"acm2",1) );
//        list2.add(1); // Compile time error
//        list2.add("ABC"); // Compile time error
        BankAccount acc3 = list2.get(0);

        // WITH GENERICS
        for (BankAccount obj : list2) {
            System.out.println( obj.getOwner() );
        }

    }

}
