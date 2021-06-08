package session14.annotation;

@Good public class GoodClass {
    
    @Good int num;
    
    @Good GoodClass() { }
    
    @Good void m() { }

    void m(@Good int arg) {

        @Good int local;

    }

}
