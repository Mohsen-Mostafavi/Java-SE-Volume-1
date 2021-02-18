package session11.enums;

public class TrafficLightTest {

    public static void main(String[] args) {

        TrafficLight light = TrafficLight.RED;

        switch(light) {

            case RED: System.out.println("You must stop!");
                      break;
            case YELLOW: System.out.println("You may go, but with care!");
                         break;
            case GREEN: System.out.println("You may go!");
                        break;

        }

    }

}
