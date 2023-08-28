package StructuralDesignPatterns.AdapterDesignPattern.Client;

import StructuralDesignPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import StructuralDesignPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import StructuralDesignPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }

}
