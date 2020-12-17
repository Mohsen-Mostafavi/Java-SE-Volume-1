package session06.facade.client;

import session06.facade.subsystem.HotelService;
import session06.facade.subsystem.TicketService;
import session06.facade.subsystem.VisaService;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Client1 {
    
    public static void main(String[] args) {
        
        int fromYear = 2018;
        int fromMonth = 1;
        int fromDay = 1;

        int toYear = 2018;
        int toMonth = 1;
        int toDay = 14;
        
        VisaService s1 = new VisaService();
        Date f1 = new GregorianCalendar(fromYear, fromMonth-1, fromDay).getTime(); // Month value is 0-based. e.g., 0 for January.
        Date t1 = new GregorianCalendar(toYear, toMonth-1, toDay).getTime();
        s1.applyForVisa(f1, t1);
        
        TicketService s2 = new TicketService();
        Calendar f2 = new GregorianCalendar(fromYear, fromMonth-1, fromDay);
        Calendar t2 = new GregorianCalendar(toYear, toMonth-1, toDay);
        s2.purchaseTicket(f2, t2);
        
        HotelService s3 = new HotelService();
        LocalDate f3 = LocalDate.of(fromYear, fromMonth, fromDay); 
        LocalDate t3 = LocalDate.of(toYear, toMonth, toDay); 
        s3.bookHotel(f3, t3);
        
    }
    
}
