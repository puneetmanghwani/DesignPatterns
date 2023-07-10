package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.Vehicle;

public interface VehicleFactory {

    public Vehicle getVehicle(String type);

}
