package session08.abstractFactory;

public class Camry extends SaloonCar {

    private String name;

    public Camry(String cName) {
        name = cName;
    }

    public String getCarName() {
        return name;
    }

    public String getCarFeatures() {
        return "Camry";
    }

}