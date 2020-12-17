package session06.facade.subsystem;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TravelFacade { // with conversational state

    private LocalDate from;
    private LocalDate to;

    public TravelFacade() {
    }
    
    public TravelFacade(String from, String to) {
        this.from = LocalDate.parse(from);
        this.to   = LocalDate.parse(to);
    }

    public void bookTheTour() {
        
        Calendar f2 = new GregorianCalendar(from.getYear(), from.getMonthValue()-1, from.getDayOfMonth()); // Month value is 0-based. e.g., 0 for January.
        Calendar t2 = new GregorianCalendar(to.getYear(), to.getMonthValue()-1, to.getDayOfMonth());
        
        VisaService s1 = new VisaService();
        Date f1 = f2.getTime();
        Date t1 = t2.getTime();
        s1.applyForVisa(f1, t1);
        
        TicketService s2 = new TicketService();
        s2.purchaseTicket(f2, t2);
        
        HotelService s3 = new HotelService();
        s3.bookHotel(from, to);
        
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }
    
}
