package session07.bankaccounts;

public class TestRef {

    public static void main(String[] args) {

        LongTerm ref3 = new LongTerm(1234,"Ali", 5000);

        DepositAccount ref2 = ref3;

        BankAccount ref1 = ref2;

    }

}
