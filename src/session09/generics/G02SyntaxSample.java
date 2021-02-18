package session09.generics;

import session07.bankaccounts.BankAccount;

import java.util.ArrayList;

public class G02SyntaxSample {

    public static void main(String[] args) {

        ArrayList<BankAccount> list1 = new ArrayList<BankAccount>(); // after 1.5

        ArrayList<BankAccount> list2 = new ArrayList<>(); // after 1.7

    }

}
