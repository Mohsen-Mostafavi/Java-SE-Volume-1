package session08.bankaccounts;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(int number, String owner, long balance) {
        super(number, owner, balance);
    }

    @Override
    public void addInterest() {
    }

}
