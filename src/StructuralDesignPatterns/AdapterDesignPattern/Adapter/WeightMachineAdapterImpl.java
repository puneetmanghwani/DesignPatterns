package StructuralDesignPatterns.AdapterDesignPattern.Adapter;

import StructuralDesignPatterns.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPound();

        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
