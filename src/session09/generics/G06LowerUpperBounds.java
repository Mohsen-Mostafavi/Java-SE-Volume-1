package session09.generics;

import session07.bankaccounts.BankAccount;
import session07.bankaccounts.DepositAccount;
import session07.bankaccounts.LongTerm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class G06LowerUpperBounds<T> {

    public static void main(String[] args) {

        ArrayList<BankAccount> a    = new ArrayList<>( Arrays.asList(new BankAccount(1234, "ACM", 1000)) );
        ArrayList<DepositAccount> b = new ArrayList<>( Arrays.asList(new DepositAccount(1234, "ACM", 1000)) );
        ArrayList<LongTerm> c       = new ArrayList<>( Arrays.asList(new LongTerm(1234, "ACM", 1000)) );

        G06LowerUpperBounds<DepositAccount> my = new G06LowerUpperBounds<DepositAccount>();

//        my.upperBoundIsDeposit( a ); // compile-time error
        my.upperBoundIsDeposit( b );
        my.upperBoundIsDeposit( c );

        my.lowerBoundIsDeposit( a );
        my.lowerBoundIsDeposit( b );
//        my.lowerBoundIsDeposit( c ); // compile-time error

    }

    void upperBoundIsDeposit(Collection<? extends T> e ) {
    }

    void lowerBoundIsDeposit(Collection<? super T> e ) {
    }

}
