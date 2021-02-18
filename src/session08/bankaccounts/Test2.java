package session08.bankaccounts;

import session07.bankaccounts.BankAccount;
import session07.bankaccounts.GharzolHasane;
import session07.bankaccounts.LongTerm;

public class Test2 {
    public static void main(String[] args) {


        BankAccount bankAccount2 =new GharzolHasane(20,"DEF",2000);

        BankAccount bankAccount1 = new LongTerm(30,"GHI",3000);


        LongTerm longTerm1 = (LongTerm) bankAccount1;


    }
}
