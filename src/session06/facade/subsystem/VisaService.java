package session06.facade.subsystem;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class VisaService {
    
    public void applyForVisa(Date from, Date to) {
        
        // Visa Application Process
        long diff = to.getTime() - from.getTime();
        long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        System.out.println("Visa Isuued for " + days + " Days");
        
    }
    
}
