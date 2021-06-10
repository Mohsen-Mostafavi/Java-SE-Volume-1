package session15.weld.hello;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/*
 Add weld jar files
 Add beans.xml
*/

public class MainHello {
    
    public static void main(String[] args) {
        
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        
        HelloService h = container.instance().select(HelloService.class).get();
        
        System.out.println( h.sayHello("Ali") );
        
        weld.shutdown();
        
    }

}
