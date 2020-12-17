package session06.facade.subsystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HotelService {
    
     public void bookHotel(LocalDate from, LocalDate to) {
        
        // Book the Hotel
        long days = ChronoUnit.DAYS.between(from, to);
        System.out.println("Hotel Booked for " + days + " Days");
        
    }
    
}
