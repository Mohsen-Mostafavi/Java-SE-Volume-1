package session15.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    
    public static void main(String[] args) {
        
        String path = "classpath:/session15/spring/annotation/context1.xml";

        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        
        BankClient ba = (BankClient) ctx.getBean("bankClient");
        
        ba.transfer(112333, 100); 
        
    }

}
