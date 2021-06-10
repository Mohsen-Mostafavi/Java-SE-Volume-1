package session15.dependencyinjection.usage;

import session15.dependencyinjection.engine.MyContext;

public class Start {
    
    public static void main(String[] args) {
        
        BankClient client = new BankClient();
        
        new MyContext("src/session15/dependencyinjection/usage/my-context.txt").injectIn(client);
        
        client.transfer(11451, 500);
        
    }

}
