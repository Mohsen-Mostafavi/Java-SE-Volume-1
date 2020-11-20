package session02;


public class Main {

    public static void main(String[] args) {


        Light lt;
        lt = new Light();
        lt.turnOn();

        lt = new Light();

        boolean b;

        b = lt.on;
        System.gc();


        Light light = new Light();
        Light light1 = light;
        Light light2 = light;
        Light light3 = light;

        Light light4 = new Light();

    }


}
