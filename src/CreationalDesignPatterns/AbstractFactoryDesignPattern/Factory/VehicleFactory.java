package CreationalDesignPatterns.AbstractFactoryDesignPattern.Factory;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Vehicle;

public interface VehicleFactory {

    public Vehicle getVehicle(String type);

}
