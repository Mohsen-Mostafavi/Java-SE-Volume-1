package session16.thread.locking.automatic;

import session16.thread.locking.automatic.BankAccount;

public class TestBankAccountConcurrentChange {

    // Run this test a few times... and the result will change
    public static void main(String[] args) throws Exception  {
        
        BankAccount sharedObject = new BankAccount(0);
        
        Thread t1 = new Thread( () -> { sharedObject.change(); }  );
        Thread t2 = new Thread( () -> { sharedObject.change(); }  );
        Thread t3 = new Thread( () -> { sharedObject.change(); }  );
        Thread t4 = new Thread( () -> { sharedObject.change(); }  );
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        
        System.out.println( sharedObject.getBalance() ); //  The result is Non-deterministic!!!
        /* But if you add synchronized to m1() result will be deterministic */
        
    }

}
