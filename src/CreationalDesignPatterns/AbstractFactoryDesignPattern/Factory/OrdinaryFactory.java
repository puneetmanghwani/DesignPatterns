package CreationalDesignPatterns.AbstractFactoryDesignPattern.Factory;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.*;

public class OrdinaryFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String type) {

        switch (type){
            case "OrdinaryV1":
                return new OrdinaryV1();
            case "OrdinaryV2":
                return new OrdinaryV2();
            default:
                return null;
        }

    }

}
