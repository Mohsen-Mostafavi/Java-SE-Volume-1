package session08.abstractFactory;

public class Saipa extends VehicleFactory {

    public SaloonCar getCar() {
        return new Pride("Pride");
    }

    public SUVCar getSUV() {
        return new Roniz("Roniz");
    }

}