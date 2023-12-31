package BehavioralDesignPatterns.StrategyDesignPattern.WithStrategy;

import BehavioralDesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

    @Override
    public void drive(){
        System.out.println("sports drive");
    }

}
