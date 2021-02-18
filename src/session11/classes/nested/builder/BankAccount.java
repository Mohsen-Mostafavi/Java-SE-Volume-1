package session11.classes.nested.builder;

public class BankAccount {

    private long number;
    private String owner;
    private String branch;
    private double balance;

    private BankAccount() {
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static class Builder { // Nested Class

        private long number;
        private String owner;
        private String branch;
        private double balance;

        public Builder(long number) {
            this.number = number;
        }

        public Builder withOwner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }

        public BankAccount build() {

            BankAccount account = new BankAccount();
            account.number  = this.number;
            account.owner   = this.owner;
            account.branch  = this.branch;
            account.balance = this.balance;
            return account;

        }

    }

    public static void main(String[] args) {

        BankAccount account =
                new Builder(1234)
                .withOwner("Venus")
                .atBranch("SaadatAbbad")
                .openingBalance(1000)
                .build();

    }

}