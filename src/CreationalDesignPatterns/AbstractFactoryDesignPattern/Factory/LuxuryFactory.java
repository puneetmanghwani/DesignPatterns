package CreationalDesignPatterns.AbstractFactoryDesignPattern.Factory;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.LuxuryV1;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.LuxuryV2;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Vehicle;

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
