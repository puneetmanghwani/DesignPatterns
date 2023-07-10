package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Factory.VehicleFactory;
import AbstractFactoryDesignPattern.Factory.VehicleTypeFactory;
import FactoryDesingPattern.Shape;
import FactoryDesingPattern.ShapeFactory;

public class Main {

    public static void main(String args[]){
        VehicleTypeFactory vehicleTypeFactory = new VehicleTypeFactory();
        VehicleFactory luxuryFactory = vehicleTypeFactory.getVehicleFactory("Luxury");
        Vehicle luxuryV1 = luxuryFactory.getVehicle("LuxuryV1");
        Vehicle luxuryV2 = luxuryFactory.getVehicle("LuxuryV2");
        luxuryV1.drive();
        luxuryV2.drive();
        VehicleFactory ordinaryFactory = vehicleTypeFactory.getVehicleFactory("Ordinary");
        Vehicle ordinaryV1 = ordinaryFactory.getVehicle("OrdinaryV1");
        Vehicle ordinaryV2 = ordinaryFactory.getVehicle("OrdinaryV2");
        ordinaryV1.drive();
        ordinaryV2.drive();
    }

}
