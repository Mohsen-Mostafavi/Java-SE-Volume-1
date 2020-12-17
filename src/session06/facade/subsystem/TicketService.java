package session06.facade.subsystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TicketService {
    
     public void purchaseTicket(Calendar from, Calendar to) {
        
        // Purchase the ticket
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
        String f = dateFormat.format( from.getTime() );
        String t = dateFormat.format( to.getTime() );
        System.out.println("Ticket Purchased for " + f + " and " + t);
        
    }
    
}
