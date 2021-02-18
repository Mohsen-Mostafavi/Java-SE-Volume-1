package session10.proxy;

public class TransferProxy implements ITransfer {

    private ITransfer service = new TransferServiceImpl();
    
    public void transfer(int acc1, int acc2, long amount) {
        
        System.out.println("Connect to the server...");
        
        service.transfer(acc1, acc2, amount); // call the target object method!

    }

}
