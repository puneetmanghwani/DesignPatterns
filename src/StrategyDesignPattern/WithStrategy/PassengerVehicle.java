package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }

}
