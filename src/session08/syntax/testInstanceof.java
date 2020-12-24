package session08.syntax;

import session07.bankaccounts.BankAccount;
import session07.bankaccounts.DepositAccount;
import session07.bankaccounts.LongTerm;
import session07.bankaccounts.ShortTerm;

public class testInstanceof {
    public static void main(String[] args) {

//        BankAccount bankAccount = new LongTerm(10,"ABC",1000);
//
//        if (bankAccount instanceof DepositAccount){
//
//        }

        BankAccount[] array = { new LongTerm(3, "X", 1000), new ShortTerm(4, "Y", 1000) };

        for (BankAccount ba : array) {
            if (ba instanceof  LongTerm){

            }
        }
    }
}
