package session11.classes.inner.sample;

public class Hand extends BodyPart { // outer

    //Finger[] fingers;

    public Hand() {
        System.out.println("An object of Hand is created!");
        setName("Dast");
    }

    class Finger extends BodyPart { // Inner

        public Finger() {
            System.out.println("An object of Finger is created!");
            setName("Angosht");
        }

    }


}
