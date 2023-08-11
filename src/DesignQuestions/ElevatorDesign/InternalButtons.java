package DesignQuestions.ElevatorDesign;

public class InternalButtons {

    InternalButtonDispatcher internalButtonDispatcher = new InternalButtonDispatcher();

    int[] availableButtons = {1,2,3,4,5,6,7};

    int buttonSelected;

    void pressButton(int destination, ElevatorCar elevatorCar){
        //1.check if destination is in the list of available floors

        //2.submit the request to the jobDispatcher
        internalButtonDispatcher.submitInternalRequest(destination, elevatorCar);
    }
}
