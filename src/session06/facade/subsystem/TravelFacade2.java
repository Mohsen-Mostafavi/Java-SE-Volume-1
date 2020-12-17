package session06.facade.subsystem;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TravelFacade2 { // No conversational state 

    private TravelFacade2() {
    }

    public static void bookTheTour(String from, String to) {
        
        LocalDate f = LocalDate.parse(from);
        LocalDate t = LocalDate.parse(to);
        
        Calendar f2 = new GregorianCalendar(f.getYear(), f.getMonthValue()-1, f.getDayOfMonth()); // Month value is 0-based. e.g., 0 for January.
        Calendar t2 = new GregorianCalendar(t.getYear(), t.getMonthValue()-1, t.getDayOfMonth());
        
        VisaService s1 = new VisaService();
        Date f1 = f2.getTime();
        Date t1 = t2.getTime();
        s1.applyForVisa(f1, t1);
        
        TicketService s2 = new TicketService();
        s2.purchaseTicket(f2, t2);
        
        HotelService s3 = new HotelService();
        s3.bookHotel(f, t);
        
    }
    
}
