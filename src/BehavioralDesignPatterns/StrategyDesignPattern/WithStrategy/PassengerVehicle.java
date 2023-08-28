package BehavioralDesignPatterns.StrategyDesignPattern.WithStrategy;

import BehavioralDesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }

}
