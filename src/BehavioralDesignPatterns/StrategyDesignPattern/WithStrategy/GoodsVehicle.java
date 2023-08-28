package BehavioralDesignPatterns.StrategyDesignPattern.WithStrategy;

import BehavioralDesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }

}
