package DesignQuestions.VendingMachine;

import DesignQuestions.VendingMachine.VendingStates.State;

public class Main {
    public static void main(String args[]){
        VendingMachine vendingMachine = new VendingMachine();
        try{
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");
            fillingUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            State vendineMachineState = vendingMachine.getVendingMachineState();
            vendineMachineState.clickOnInsertCoinButton(vendingMachine);

            vendineMachineState = vendingMachine.getVendingMachineState();
            vendineMachineState.insertCoin(vendingMachine, Coin.NICKEL);
            vendineMachineState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            vendineMachineState.clickOnStartProductSelectionButton(vendingMachine);

            vendineMachineState = vendingMachine.getVendingMachineState();
            vendineMachineState.chooseProduct(vendingMachine, 102);

            displayInventory(vendingMachine);
        } catch (Exception e){
            displayInventory(vendingMachine);
        }
    }

    private static void fillingUpInventory(VendingMachine vendingMachine){
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();
            if(i>=0 && i<3){
                newItem.setItemType(ItemType.COKE);
                newItem.setPrice(12);
            }else if(i >=3 && i<5){
                newItem.setItemType(ItemType.PEPSI);
                newItem.setPrice(9);
            }else if(i >=5 && i<7){
                newItem.setItemType(ItemType.JUICE);
                newItem.setPrice(13);
            }else if(i >=7 && i<10){
                newItem.setItemType(ItemType.SODA);
                newItem.setPrice(7);
            }

            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine){

        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getItemType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }
}
