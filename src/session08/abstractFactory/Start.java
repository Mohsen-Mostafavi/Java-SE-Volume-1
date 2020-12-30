package session08.abstractFactory;

public class Start {

    public static void main(String[] args) {

        String vhCategory = VehicleFactory.LUXURY_VEHICLE;
        String vhType = "SUV";

        VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);
        
        if (vhType.equals("SALOON")) {
            SaloonCar c = vf.getCar();
            System.out.println("You can buy this saloon car: " + c.getCarName() +
                    " Features: " + c.getCarFeatures());
        }
        if (vhType.equals("SUV")) {
            SUVCar s = vf.getSUV();
            System.out.println("You can buy this SUV car: " + s.getSUVName() +
                    " Features: " + s.getSUVFeatures());
        }

    }
    
}
