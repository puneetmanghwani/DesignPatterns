package DesignQuestions.VendingMachine;

import DesignQuestions.VendingMachine.VendingStates.Impl.IdleState;
import DesignQuestions.VendingMachine.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;

    private Inventory inventory;

    private List<Coin> coinList;

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }
}
