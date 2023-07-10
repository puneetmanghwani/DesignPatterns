package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.LuxuryV1;
import AbstractFactoryDesignPattern.LuxuryV2;
import AbstractFactoryDesignPattern.Vehicle;

public class LuxuryFactory implements VehicleFactory{


    @Override
    public Vehicle getVehicle(String type) {

        switch (type){
            case "LuxuryV1":
                return new LuxuryV1();
            case "LuxuryV2":
                return new LuxuryV2();
            default:
                return null;
        }

    }
}
