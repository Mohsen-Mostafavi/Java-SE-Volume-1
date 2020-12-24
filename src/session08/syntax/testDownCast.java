package session08.syntax;

import session07.bankaccounts.BankAccount;
import session07.bankaccounts.LongTerm;

public class testDownCast {
    public static void main(String[] args) {

        BankAccount ba = new LongTerm(10,"ACM",1000);

        LongTerm lt = (LongTerm) ba ;

        BankAccount bb = new BankAccount(10,"ACM",1000);

        LongTerm ltt = (LongTerm) bb ;

    }
}
