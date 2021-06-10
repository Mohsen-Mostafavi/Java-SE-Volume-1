package session15.spring.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 Add spring jar files
*/

public class Client {
    
    public static void main(String[] args) {

        String path = "classpath:/session15/spring/lookup/context1.xml";

        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);

        ITransfer transfer = (ITransfer) ctx.getBean("bank");
        
        transfer.transfer(111, 100);
        
    }
    
}
