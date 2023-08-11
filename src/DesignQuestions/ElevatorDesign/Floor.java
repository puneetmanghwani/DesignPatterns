package DesignQuestions.ElevatorDesign;

public class Floor {
    int floorNumber;

    ExternalButton externalButton;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
    }

    public void pressButton(Direction direction){
        externalButton.pressButton(floorNumber, direction);
    }
}
