package session10.proxy;

public class ServiceFactory {
    
    public static ITransfer getService() {
        
        //return new TransferServiceImpl();
        return new TransferProxy();
        
    }

}
