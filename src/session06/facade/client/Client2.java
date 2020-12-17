package session06.facade.client;

import session06.facade.subsystem.TravelFacade;

public class Client2 {
    
    public static void main(String[] args) {
        
        TravelFacade facade = new TravelFacade("2018-01-01", "2018-01-14");

        facade.bookTheTour();
        
    }
    
}

