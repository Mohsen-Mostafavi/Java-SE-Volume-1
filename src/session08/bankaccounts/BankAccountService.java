package session08.bankaccounts;

public class BankAccountService {

    public void transfer(BankAccount firstAccount, BankAccount secondAccount, long amount) {

        firstAccount.withdraw(amount);
        secondAccount.deposit(amount);

    }

    public void runInterest(BankAccount[] list) {

        for (BankAccount ba : list) {
            ba.addInterest();
        }

    }

    public void m(BankAccount bankAccount){

        int i;
        String s;
        BankAccount ba = new CurrentAccount(10,"ab",1000);
    }

}
