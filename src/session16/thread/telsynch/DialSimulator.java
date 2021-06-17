package session16.thread.telsynch;

public class DialSimulator {
    
     public static void main(String[] args) {
         
         TelHandSet ths = new TelHandSet();
         
         new DialPerson("Shadi", ths).start();
         new DialPerson("Samin",  ths).start();
         new DialPerson("Parnian",  ths).start();
         
     }
    
}
