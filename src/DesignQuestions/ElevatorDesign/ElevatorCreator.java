package DesignQuestions.ElevatorDesign;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllerList = new ArrayList<>();

    public void create(){
        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.elevatorId = 1;
        ElevatorController elevatorController1 = new ElevatorController(elevatorCar1);

        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar1.elevatorId =2;
        ElevatorController controller2 = new ElevatorController(elevatorCar2);

        elevatorControllerList.add(elevatorController1);
        elevatorControllerList.add(controller2);
    }
}
