package DesignQuestions.ElevatorDesign;

public class ExternalButton {

    ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher();

    void pressButton(int destination, Direction direction) {

        //1.check if destination is in the list of available floors

        //2.submit the request to the jobDispatcher
        externalButtonDispatcher.submitExternalRequest(destination, direction);
    }
}
