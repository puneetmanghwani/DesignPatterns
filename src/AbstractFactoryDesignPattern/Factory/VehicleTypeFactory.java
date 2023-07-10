package AbstractFactoryDesignPattern.Factory;

public class VehicleTypeFactory {

    public VehicleFactory getVehicleFactory(String factoryType){
        switch (factoryType){
            case "Luxury":
                return new LuxuryFactory();
            case "Ordinary":
                return new OrdinaryFactory();
            default:
                return null;
        }
    }

}
