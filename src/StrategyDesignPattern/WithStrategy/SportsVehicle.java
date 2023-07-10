package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.DriveStrategy;
import StrategyDesignPattern.WithStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

    @Override
    public void drive(){
        System.out.println("sports drive");
    }

}
