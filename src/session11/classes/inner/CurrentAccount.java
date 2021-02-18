package session11.classes.inner;

public class CurrentAccount { // Outer

    private long balance;

    void m() {
        System.out.println("This is CurrentAccount!");
        System.out.println( "CurrentAccount.Balance is: " + balance );
    }

    private class CheckBook { // Inner

        void m() {
            System.out.println("This is CheckBook!");
            balance++;
        }

        void issue() {
            this.m(); // Inner version of m()
            CurrentAccount.this.m(); // Outer version of m()
        }

    }

    public static void main(String[] args) {

        CurrentAccount c = new CurrentAccount();
        CheckBook book = c.new CheckBook();
        book.issue();

    }

}
