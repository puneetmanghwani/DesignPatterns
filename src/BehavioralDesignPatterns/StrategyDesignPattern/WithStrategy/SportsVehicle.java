package BehavioralDesignPatterns.StrategyDesignPattern.WithStrategy;

import BehavioralDesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

    @Override
    public void drive(){
        System.out.println("sports drive");
    }

}
