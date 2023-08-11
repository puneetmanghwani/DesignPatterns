package DesignQuestions.ElevatorDesign;

import java.util.PriorityQueue;

public class ElevatorController {
    ElevatorCar elevatorCar;

    PriorityQueue<Integer> upMinPq;

    PriorityQueue<Integer> downMaxPq;

    public ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
        upMinPq = new PriorityQueue<>();
        downMaxPq = new PriorityQueue<>((a,b)->b-a);
    }

    public void submitExternalRequest(int floor, Direction direction){
        if(direction == Direction.DOWN){
            downMaxPq.offer(floor);
        } else {
            upMinPq.offer(floor);
        }
    }

    public void submitInternalRequest(int floor){

    }

    public void controlElevator(){
        while(true){
            if(elevatorCar.elevatorDirection == Direction.UP){

            }
        }
    }
}
