package session03.exercise.rozhin;


public class Seller {
    Personality seller1= new Personality(1);
    public void request1(){
        System.out.println("Seller 1");
        Inventor Inventor1=new Inventor();
        Inventor1.deliver1();
    }


    Personality seller2= new Personality(2);
    public void request2(){
        System.out.println("Seller 2");
        Inventor Inventor2=new Inventor();
        Inventor2.deliver2();
    }



}
